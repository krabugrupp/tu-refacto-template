package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "IR_HARIDUS")
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_HARIDUS")
    private Long id;

    // Mis isiku haridusega on tegemist
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK", nullable = false)
    private Person person;

    // Mis asutusest on haridus saadud
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ASUTUS")
    private Institution institution;

    // IR klassifikaator 250: alg, kesk, korg
    @Column(name = "KL_LIIK")
    private int educationLevel;

    // Haridust tõendava dokumendi number
    @Column(name = "DOKUMENDI_NR", length = 30)
    private String documentNumber;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private int updatedBy;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    // Õppekava nominaalkestus aastates
    @Column(name = "OPPEKAVA_KESTUS")
    private int curriculumDuration;

    // Kui hariduse liik = 2 (kesk), siis klassifikaator 229. Kui hariduse liik = 3 (korg), siis klassifikaator 120
    @Column(name = "KL_OPPEVORM")
    private int educationForm;

    // Hariduse algusaasta
    @Column(name = "ALGUS_AASTA")
    private int startYear;

    // Hariduse lõppaasta
    @Column(name = "LOPP_AASTA")
    private int endYear;

    // todo Omandatud haridustase klassifikaatorist 616 (admin.a_klass id_liik = 616)
    @Column(name = "KL_HARIDUSTASE")
    private int educationLevelClass;

    // todo Keskkoolist saadud medal klassifikaatorist 230 (admin.a_klass id_liik = 230)
    @Column(name = "KL_MEDAL")
    private int medal;

    // Kas ülikool/kõrgkool lõpetati kiitusega
    @Column(name = "KAS_CUM_LAUDE")
    private int isGoldMedal;

    // todo Axapta haridustase klassifikaatorist 108 (admin.a_klass.id_liik = 108). Tuleb ainult Axaptast, vajalik EHIS õppejõudude registri jaoks
    @Column(name = "KL_AXAPTA_HARIDUSTASE")
    private int axaptaEducationLevel;

    // Hariduse andnud asutuse id FO-s
    @Column(name = "EDUCATIONCENTERID", length = 15)
    private String foEducationCenterId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "education")
    private List<Degree> degreeList = new ArrayList<>();
}

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
@Table(name = "IR_ASUTUS")
@NoArgsConstructor
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ASUTUS")
    private Long id;

    @Column(name = "NIMI", length = 100, nullable = false)
    private String name;

    @Column(name = "KL_LIIK", nullable = false)
    private int irClassifierCode = 231;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    @Column(name = "NIMI_IK", length = 200)
    private String nameEn;

    @Column(name = "NIMI_ORIGINAALKEELES", length = 200)
    private String nameOriginal;

    // Todo bool? or Oracle works with int's
    @Column(name = "KAS_AMETLIK_IK_TOLGE")
    private boolean isOfficiallyTranslated;

    @Column(name = "VEEBILEHT", length = 150)
    private String website;

    @Column(name = "NIMI_TRANS", length = 200)
    private String nameTranslated;

    // Todo bool? or Oracle works with int's
    @Column(name = "KAS_SULETUD")
    private boolean isClosed;

    @Column(name = "SULGEMISE_AASTA")
    private int closedAtYear;

    @Column(name = "KL_TYYP")
    private int irEducationInstituteCode = 701;

    @Column(name = "ERASMUS_KOOD", length = 50)
    private String erasmusCode;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "institution")
    private List<Degree> givenDegreeList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "institution")
    private List<Education> educationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "institution")
    private List<Residence> residenceList = new ArrayList<>();

}

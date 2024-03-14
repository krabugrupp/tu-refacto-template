package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "IR_ASUTUS")
@NoArgsConstructor
public class Institution {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ASUTUS")
    public Long id;

    @Column(name = "NIMI", length = 100, nullable = false)
    public String name;

    @Column(name = "KL_LIIK", nullable = false)
    public int irClassifierCode = 231;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    @Column(name = "NIMI_IK", length = 200)
    public String nameEn;

    @Column(name = "NIMI_ORIGINAALKEELES", length = 200)
    public String nameOriginal;

    // Todo bool? or Oracle works with int's
    @Column(name = "KAS_AMETLIK_IK_TOLGE")
    public boolean isOfficiallyTranslated;

    @Column(name = "VEEBILEHT", length = 150)
    public String website;

    @Column(name = "NIMI_TRANS", length = 200)
    public String nameTranslated;

    // Todo bool? or Oracle works with int's
    @Column(name = "KAS_SULETUD")
    public boolean isClosed;

    @Column(name = "SULGEMISE_AASTA")
    public int closedAtYear;

    @Column(name = "KL_TYYP")
    public int irEducationInstituteCode = 701;

    @Column(name = "ERASMUS_KOOD", length = 50)
    public String erasmusCode;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "institution")
    private List<Degree> givenDegreeList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "institution")
    private List<Education> educationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "institution")
    private List<Residence> residenceList = new ArrayList<>();

}
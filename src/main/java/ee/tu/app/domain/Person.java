package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "IR_ISIK")
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_ISIK", nullable = false)
    private Long id;

    // Isiku eesnimi
    @Column(name = "E_NIMI", length = 100)
    private String firstName;

    // Isiku perekonnanimi
    @Column(name = "P_NIMI", length = 100)
    private String lastName;

    // Isiku isanimi, enam ei kasutata // todo to delete?
    @Column(name = "I_NIMI", length = 100)
    private String fatherName;

    // Eesti isikukood, unikaalne
    @Column(name = "ISIKUKOOD", length = 20)
    private String registryCode;

    // Maksuameti kood. Eriti ei kasutata
    @Column(name = "MAKSUAMETI_KOOD", length = 20)
    private String taxInstitutionCode;

    // Isiku sünniaeg
    @Column(name = "SYNNIAEG")
    private Date birthDate;

    // Isiku sugu IR klassifikaatorist 101 (1=mees, 2=naine)
    @Column(name = "SUGU")
    private int sex;

    // Isikuandmete muutmise alus (nt AXAPTA, VV)
    @Column(name = "ALUS", length = 1000)
    private int updateSource;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    // Kodakondsuse id_maad
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAAD_KODAKONDSUS")
    private Country countryCitizenship;

    //Isiku unikaalne ja avalik UUID [ÕIS2]
    @Column(name = "UUID", length = 40)
    private String uuid;

    // FO isiku id, muudetakse ainult fo-ir liidese kaudu
    @Column(name = "EMPLID", length = 20)
    private String emplId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<PersonAttribute> personAttributeList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<Nickname> personNicknameList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<NameChange> personNameChangeList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<Contact> personContactList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<Education> personEducationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "oldPerson")
    private List<DuplicatePersonsLog> oldPersonsDuplicateEducationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "newPerson")
    private List<DuplicatePersonsLog> newPersonsDuplicateEducationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<EmploymentCategory> employmentCategoryList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<EmploymentContract> employmentContractList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "replacingPerson")
    private List<EmploymentContractTermination> replacingPersonEmploymentContractTerminationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<ForeignCitizenship> foreignCitizenshipList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<Image> imageList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<Residence> residenceList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "person")
    private List<LanguageLevel> languageLevelList = new ArrayList<>();


    public String getFullName() {
        return firstName + " " + lastName;
    }
}

package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "IR_MAAD")
public class Country {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_MAAD")
    private Long id;

    // Ei kasutata todo delete?
    @Column(name = "MASTER")
    private int master;

    // Maa nimi
    @Column(name = "NIMI", length = 50)
    private String name;

    // Maa pealinn, ei kasutata todo delete?
    @Column(name = "PEALINN", length = 50)
    private String capitalCity;

    // Maa ISO2 kood
    @Column(name = "ISO2", length = 2)
    private String iso2;

    // Maa ISO3 kood
    @Column(name = "ISO3", length = 5)
    private String iso3;

    // Maa ISO numbriline kood
    @Column(name = "ISONUM")
    private int isoNumeric;

    // Maa nimetus inglise keeles
    @Column(name = "NIMI_IK", length = 100)
    private String nameEn;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "country")
    private List<ResidenceCode> residenceCodeList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "countryCitizenship")
    private List<Person> personList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "country")
    private List<ForeignCitizenship> foreignCitizenshipList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "country")
    private List<Residence> residenceList = new ArrayList<>();
}

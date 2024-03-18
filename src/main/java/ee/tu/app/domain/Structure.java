package ee.tu.app.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "IR_STRUKTUUR")
public class Structure {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_STRUKTUUR")
    private Long id;

    // Viide ülemüksusele todo
    @Column(name = "ID_MASTER_STRUKTUUR")
    private int masterStructureId;

    // Järjekorranumber samal tasemel sama ülemüksuse all
    @Column(name = "JRK")
    private int sequenceNmbr;

    // Struktuuriüksuse kood. Unikaalne üle kogu ülikooli
    @Column(name = "KOOD")
    private String code;

    // Struktuuriüksuse nimetus
    @Column(name = "NIMETUS")
    private String name;

    // Üksuse liik klassifikaatorist 304
    @Column(name = "LIIK")
    private int type;

    // Struktuuriüksuse kehtivuse alguskuupäev
    @Column(name = "ALGUS")
    private Date startDate;

    // Struktuuriüksuse kehtivuse lõppkuupäev
    @Column(name = "LOPP")
    private Date endDate;

    // Viide üksuse hierarhia esimesele tasemele todo
    @Column(name = "ID_ESIM_TASE")
    private int firstLevelId;

    // Viide üksuse hierarhia teisele tasemele (kui on) todo
    @Column(name = "ID_TEINE_TASE")
    private int secondLevelId;

    // Viide üksuse hierarhia kolmandale tasemele (kui on) todo
    @Column(name = "ID_KOLMAS_TASE")
    private int thirdLevelId;

    // Mis taseme üksusega on tegemist
    @Column(name = "STR_TASE")
    private int level;

    // Struktuuriüksuse e-posti aadress
    @Column(name = "EMAIL")
    private String email;

    // Struktuuriüksuse WWW-aadress
    @Column(name = "WWW")
    private String website;

    // Struktuuriüksuse telefon
    @Column(name = "TELEFON")
    private String phone;

    // Struktuuriüksuse faks
    @Column(name = "FAKS")
    private String fax;

    // Struktuuriüksuse postiindeks
    @Column(name = "ZIP")
    private String zipCode;

    // Struktuuriüksuse aadress vaba tekstina
    @Column(name = "AADRESS")
    private String address;

    // Struktuuriüksuse nimetus inglise keeles
    @Column(name = "NIMETUS_IK")
    private String nameEn;

    // Struktuuri nimetus omastavast käändes
    @Column(name = "NIMETUS_OMASTAV")
    private String nameOmastav;

    // Kas tegemist on akadeemilise str.üksusega
    @Column(name = "KAS_AKADEEMILINE")
    private boolean isAcademic;

    // Linnuke, mille järgi näidatakse struktuurivalikut teatud kohtades, kus kas_akadeemiline ei kõlba. Nt täienduskoolituses
    @Column(name = "KAS_TAIENDUSOPE")
    private boolean isAdditionalEducation;

    // Struktuuriüksuse tänav
    @Column(name = "TANAV")
    private String street;

    // Struktuuriüksuse linn
    @Column(name = "LINN")
    private String city;

    // Üksuse arvestaja id_isik väärtus todo
    @Column(name = "ID_ISIK_ARVESTAJA")
    private int accountantPersonId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "structure")
    private List<EmploymentCategory> employmentCategoryList = new ArrayList<>();
}

package ee.tu.app.domain;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IR_STRUKTUUR")
public class Structure {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_STRUKTUUR")
    public int id;

    // Viide ülemüksusele todo
    @Column(name = "ID_MASTER_STRUKTUUR")
    public int masterStructureId;

    // Järjekorranumber samal tasemel sama ülemüksuse all
    @Column(name = "JRK")
    public int sequenceNmbr;

    // Struktuuriüksuse kood. Unikaalne üle kogu ülikooli
    @Column(name = "KOOD")
    public String code;

    // Struktuuriüksuse nimetus
    @Column(name = "NIMETUS")
    public String name;

    // Üksuse liik klassifikaatorist 304
    @Column(name = "LIIK")
    public int type;

    // Struktuuriüksuse kehtivuse alguskuupäev
    @Column(name = "ALGUS")
    public Date startDate;

    // Struktuuriüksuse kehtivuse lõppkuupäev
    @Column(name = "LOPP")
    public Date endDate;

    // Viide üksuse hierarhia esimesele tasemele todo
    @Column(name = "ID_ESIM_TASE")
    public int firstLevelId;

    // Viide üksuse hierarhia teisele tasemele (kui on) todo
    @Column(name = "ID_TEINE_TASE")
    public int secondLevelId;

    // Viide üksuse hierarhia kolmandale tasemele (kui on) todo
    @Column(name = "ID_KOLMAS_TASE")
    public int thirdLevelId;

    // Mis taseme üksusega on tegemist
    @Column(name = "STR_TASE")
    public int level;

    // Struktuuriüksuse e-posti aadress
    @Column(name = "EMAIL")
    public String email;

    // Struktuuriüksuse WWW-aadress
    @Column(name = "WWW")
    public String website;

    // Struktuuriüksuse telefon
    @Column(name = "TELEFON")
    public String phone;

    // Struktuuriüksuse faks
    @Column(name = "FAKS")
    public String fax;

    // Struktuuriüksuse postiindeks
    @Column(name = "ZIP")
    public String zipCode;

    // Struktuuriüksuse aadress vaba tekstina
    @Column(name = "AADRESS")
    public String address;

    // Struktuuriüksuse nimetus inglise keeles
    @Column(name = "NIMETUS_IK")
    public String nameEn;

    // Struktuuri nimetus omastavast käändes
    @Column(name = "NIMETUS_OMASTAV")
    public String nameOmastav;

    // Kas tegemist on akadeemilise str.üksusega
    @Column(name = "KAS_AKADEEMILINE")
    public boolean isAcademic;

    // Linnuke, mille järgi näidatakse struktuurivalikut teatud kohtades, kus kas_akadeemiline ei kõlba. Nt täienduskoolituses
    @Column(name = "KAS_TAIENDUSOPE")
    public boolean isAdditionalEducation;

    // Struktuuriüksuse tänav
    @Column(name = "TANAV")
    public String street;

    // Struktuuriüksuse linn
    @Column(name = "LINN")
    public String city;

    // Üksuse arvestaja id_isik väärtus todo
    @Column(name = "ID_ISIK_ARVESTAJA")
    public int accountantPersonId;

}

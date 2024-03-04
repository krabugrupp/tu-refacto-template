package com.tu.app.domain;
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
    @Column(name = "KOOD", nullable = false, length = 20)
    public String code;

    // Struktuuriüksuse nimetus
    @Column(name = "NIMETUS", length = 150)
    public String name;

    // Üksuse liik klassifikaatorist 304
    @Column(name = "LIIK", nullable = false)
    public int type;

    // Struktuuriüksuse kehtivuse alguskuupäev
    @Column(name = "ALGUS", nullable = false)
    public Date startDate;

    // Struktuuriüksuse kehtivuse lõppkuupäev
    @Column(name = "LOPP")
    public Date endDate;

    // Viide üksuse hierarhia esimesele tasemele todo
    @Column(name = "ID_ESIM_TASE", nullable = false)
    public int firstLevelId;

    // Viide üksuse hierarhia teisele tasemele (kui on) todo
    @Column(name = "ID_TEINE_TASE")
    public int secondLevelId;

    // Viide üksuse hierarhia kolmandale tasemele (kui on) todo
    @Column(name = "ID_KOLMAS_TASE")
    public int thirdLevelId;

    // Mis taseme üksusega on tegemist
    @Column(name = "STR_TASE", length = 2)
    public int level;

    // Struktuuriüksuse e-posti aadress
    @Column(name = "EMAIL", length = 160)
    public String email;

    // Struktuuriüksuse WWW-aadress
    @Column(name = "WWW", length = 255)
    public String website;

    // Struktuuriüksuse telefon
    @Column(name = "TELEFON", length = 50)
    public String phone;

    // Struktuuriüksuse faks
    @Column(name = "FAKS", length = 20)
    public String fax;

    // Struktuuriüksuse postiindeks
    @Column(name = "ZIP", length = 10)
    public String zipCode;

    // Struktuuriüksuse aadress vaba tekstina
    @Column(name = "AADRESS", length = 500)
    public String address;

    // Struktuuriüksuse nimetus inglise keeles
    @Column(name = "NIMETUS_IK", length = 150)
    public String nameEn;

    // Struktuuri nimetus omastavast käändes
    @Column(name = "NIMETUS_OMASTAV", length = 150)
    public String nameOmastav;

    // Kas tegemist on akadeemilise str.üksusega todo bool??
    @Column(name = "KAS_AKADEEMILINE", nullable = false, length = 1)
    public boolean isAcademic;

    // Linnuke, mille järgi näidatakse struktuurivalikut teatud kohtades, kus kas_akadeemiline ei kõlba. Nt täienduskoolituses todo bool??
    @Column(name = "KAS_TAIENDUSOPE", length = 1)
    public boolean isAdditionalEducation;

    // Struktuuriüksuse tänav
    @Column(name = "TANAV", length = 250)
    public String street;

    // Struktuuriüksuse linn
    @Column(name = "LINN", length = 200)
    public String city;

    // Üksuse arvestaja id_isik väärtus todo
    @Column(name = "ID_ISIK_ARVESTAJA")
    public int accountantPersonId;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public int updatedBy;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;
}

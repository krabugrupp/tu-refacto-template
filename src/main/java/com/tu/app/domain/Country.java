package com.tu.app.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IR_MAAD")
public class Country {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_MAAD")
    public int id;

    // Ei kasutata todo delete?
    @Column(name = "MASTER")
    public int master;

    // Maa nimi
    @Column(name = "NIMI", length = 50)
    public String name;

    // Maa pealinn, ei kasutata todo delete?
    @Column(name = "PEALINN", length = 50)
    public String capitalCity;

    // Maa ISO2 kood
    @Column(name = "ISO2", length = 2)
    public String iso2;

    // Maa ISO3 kood
    @Column(name = "ISO3", length = 5)
    public String iso3;

    // Maa ISO numbriline kood
    @Column(name = "ISONUM")
    public int isoNumeric;

    // Maa nimetus inglise keeles
    @Column(name = "NIMI_IK", length = 100)
    public String nameEn;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;
}

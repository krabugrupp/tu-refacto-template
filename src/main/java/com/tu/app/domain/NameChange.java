package com.tu.app.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IR_NIMI")
public class NameChange {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_NIMI")
    public int id;

    // Mis isiku nimega on tegemist
    @Column(name = "ID_ISIK")
    public int personId;

    // Isiku eelmine eesnimi
    @Column(name = "V_E_NIMI", length = 100)
    public String oldFirstName;

    // Isiku eelmine perekonnanimi
    @Column(name = "V_P_NIMI", length = 100)
    public String oldLastName;

    // Isiku eelmine sugu
    @Column(name = "SUGU")
    public int oldSex;

    // Vana nime kehtivuse lõpp (hetk, millal tekkis see rida ja ir_isik tabelis muudeti nimi uueks)
    @Column(name = "ALGUS")
    public Date changeStartDate;

    // Nime muutmise alus (AXAPTA, VV jms)
    @Column(name = "ALUS", length = 255)
    public String reason;

    // Isiku eelmine isikukood
    @Column(name = "V_ISIKUKOOD", length = 15)
    public String oldRegistrycode;


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

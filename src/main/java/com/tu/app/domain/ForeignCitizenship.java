package com.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

// Isikute välisriikide isikukoodid
@Entity
@Table(name = "IR_KODAKONDSUS_IK")
public class ForeignCitizenship {


    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KODAKONDSUS_IK")
    public int identityId;

    // Millise isiku isikukoodiga on tegemist
    @Column(name = "ID_ISIK", nullable = false)
    public int personId;

    // Välisriigi isikukood
    @Column(name = "ELAMISLUBA_ALGUS", length = 100)
    public String foreignIdentityCode;

    // Ei kasutata todo delete?
    @Column(name = "ELAMISLUBA_LOPP")
    public Date residencePermitFrom;

    // Ei kasutata todo delete?
    @Column(name = "ELAMISLUBA_LOPP")
    public Date residencePermitTo;

    // Ei kasutata todo delete?
    @Column(name = "ELAMISLUBA_DOK")
    public Date residencePermitDoc;

    // Rea kehtivuse alguse kuupäev
    @Column(name = "ALGUS")
    public Date startDate;

    // Rea kehtivuse lõppkuupäev
    @Column(name = "LOPP")
    public Date endDate;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    //Mis riigi isikukoodiga tegemist on
    @Column(name = "ID_MAAD", nullable = false)
    public int countryId;

}

package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// Isikute välisriikide isikukoodid
@Entity
@Setter
@Getter
@Table(name = "IR_KODAKONDSUS_IK")
public class ForeignCitizenship {


    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KODAKONDSUS_IK")
    private Long identityId;

    // Millise isiku isikukoodiga on tegemist
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK", nullable = false)
    private Person person;

    // Välisriigi isikukood
    @Column(name = "VISIKUKOOD", length = 100)
    private String foreignIdentityCode;

    // Ei kasutata todo delete?
    @Column(name = "ELAMISLUBA_ALGUS")
    private Date residencePermitFrom;

    // Ei kasutata todo delete?
    @Column(name = "ELAMISLUBA_LOPP")
    private Date residencePermitTo;

    // Ei kasutata todo delete?
    @Column(name = "ELAMISLUBA_DOK")
    private Date residencePermitDoc;

    // Rea kehtivuse alguse kuupäev
    @Column(name = "ALGUS")
    private Date startDate;

    // Rea kehtivuse lõppkuupäev
    @Column(name = "LOPP")
    private Date endDate;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    //Mis riigi isikukoodiga tegemist on
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAAD", nullable = false)
    private Country country;

}

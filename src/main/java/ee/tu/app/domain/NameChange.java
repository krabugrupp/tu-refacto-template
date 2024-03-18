package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_NIMI")
public class NameChange {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_NIMI")
    private Long id;

    // Mis isiku nimega on tegemist
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK")
    private Person person;

    // Isiku eelmine eesnimi
    @Column(name = "V_E_NIMI", length = 100)
    private String oldFirstName;

    // Isiku eelmine perekonnanimi
    @Column(name = "V_P_NIMI", length = 100)
    private String oldLastName;

    // Isiku eelmine sugu
    @Column(name = "SUGU")
    private int oldSex;

    // Vana nime kehtivuse lõpp (hetk, millal tekkis see rida ja ir_isik tabelis muudeti nimi uueks)
    @Column(name = "ALGUS")
    private Date changeStartDate;

    // Nime muutmise alus (AXAPTA, VV jms)
    @Column(name = "ALUS", length = 255)
    private String reason;

    // Isiku eelmine isikukood
    @Column(name = "V_ISIKUKOOD", length = 15)
    private String oldRegistrycode;


    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;
}

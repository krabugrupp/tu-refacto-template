package ee.tu.app.domain;
import jakarta.persistence.*;

import java.util.Date;

// Isikute töölepingud, tulevad ainult AXAPTAst
@Entity
@Table(name = "IR_TOOLEPING")
public class EmploymentContract {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TOOLEPING")
    public int id;

    // Millise isiku töölepinguga on tegemist
    @Column(name = "ID_ISIK")
    public int personId;

    // Töölepingu sõlmimise kuupäev
    @Column(name = "SOLMIMISE_KP")
    public Date signingDate;

    // Töölepingu number
    @Column(name = "TOOLEPINGU_NR")
    public String contractNmbr;

    // Töölepingu alguskuupäev
    @Column(name = "ALGUS_KP")
    public Date startDate;

    // Töölepingu lõppkuupäev
    @Column(name = "LOPP_KP")
    public Date endDate;

    // FO töölepingu id
    @Column(name = "CONTRACTID")
    public String FOContractId;

    // Lepingu staatus
    @Column(name = "KL_STAATUS")
    public int status;

    // Lepingu kehtivus
    @Column(name = "KL_KEHTIVUS")
    public Integer validity;

}

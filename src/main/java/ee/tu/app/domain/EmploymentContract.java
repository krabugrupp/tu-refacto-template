package ee.tu.app.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Isikute töölepingud, tulevad ainult AXAPTAst
@Entity
@Setter
@Getter
@Table(name = "IR_TOOLEPING")
public class EmploymentContract {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TOOLEPING")
    private Long id;

    // Millise isiku töölepinguga on tegemist
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK")
    private Person person;

    // Töölepingu sõlmimise kuupäev
    @Column(name = "SOLMIMISE_KP")
    private Date signingDate;

    // Töölepingu number
    @Column(name = "TOOLEPINGU_NR", length = 20)
    private String contractNmbr;

    // Töölepingu alguskuupäev
    @Column(name = "ALGUS_KP")
    private Date startDate;

    // Töölepingu lõppkuupäev
    @Column(name = "LOPP_KP")
    private Date endDate;

    // FO töölepingu id
    @Column(name = "CONTRACTID", length = 10)
    private String FOContractId;

    // Lepingu staatus
    @Column(name = "KL_STAATUS")
    private int status;

    // Lepingu kehtivus
    @Column(name = "KL_KEHTIVUS")
    private Integer validity;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "employmentContract")
    private List<EmploymentCategory> employmentCategoryList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "employmentContract")
    private List<EmploymentContractTermination> employmentContractTerminationList = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "employmentContract")
    private List<Vacation> vacationList = new ArrayList<>();
}

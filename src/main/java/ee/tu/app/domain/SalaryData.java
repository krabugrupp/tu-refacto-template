package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_PALGAASTE")
public class SalaryData {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_PALGAASTE")
    private Long id;

    // Millise töölepingu rea küljes antud palgaaste on
    @JoinColumn(name = "ID_KATEGOORIA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EmploymentCategory employmentCategory;

    // Palgaastme väärtus
    @Column(name = "PALGAASTE")
    private int salary;

    // Palgaastme kehtivuse algus
    @Column(name = "ALGUS_KP")
    private Date startDate;

    // Palgaastme kehtivuse lõpp
    @Column(name = "LOPP_KP")
    private Date endDate;

}

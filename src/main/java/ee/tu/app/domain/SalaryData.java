package ee.tu.app.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "IR_PALGAASTE")
public class SalaryData {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_PALGAASTE")
    public int id;

    // Millise töölepingu rea küljes antud palgaaste on
    @JoinColumn(name = "ID_KATEGOORIA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public EmploymentCategory employmentCategory;

    // Palgaastme väärtus
    @Column(name = "PALGAASTE")
    public int salary;

    // Palgaastme kehtivuse algus
    @Column(name = "ALGUS_KP")
    public Date startDate;

    // Palgaastme kehtivuse lõpp
    @Column(name = "LOPP_KP")
    public Date endDate;

}

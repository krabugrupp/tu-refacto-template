package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_JIRA_LOGI")
@NoArgsConstructor
public class JiraLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID")
    public int id;

    // Logi tekkimise aeg
    @Column(name = "AEG", nullable = false)
    public Date date;

    // Logi sisu tekstina
    // TODO SOME CLOB
    @Column(name = "LOGI")
    public String logs;

}

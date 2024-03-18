package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_JIRA_LOGI")
@NoArgsConstructor
public class JiraLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID")
    private Long id;

    // Logi tekkimise aeg
    @Column(name = "AEG", nullable = false)
    private Date date;

    // Logi sisu tekstina
    // TODO SOME CLOB
    @Column(name = "LOGI")
    private String logs;

}

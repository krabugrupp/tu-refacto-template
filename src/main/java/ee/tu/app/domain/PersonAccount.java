package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_ISIK_KONTO")
@NoArgsConstructor
public class PersonAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID")
    private Long id;

    // Isiku uuid mis kantakse hiljem ka IR_ISIK baasi kui tekkib ametlik konto
    @Column(name = "UUID", length = 36, nullable = false)
    private String uuid;
    // Välise konto unikaalne email
    @Column(name = "EMAIL", length = 255, nullable = false, unique = true)
    private String email;

    // Isikukood, võib olla null
    @Column(name = "ISIKUKOOD")
    private int personalCode;

    // Konto loomise kuupäev
    @Column(name = "LOOMISE_KP", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date creationDate;
}

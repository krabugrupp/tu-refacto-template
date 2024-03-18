package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// todo primary key to be changed PK_AXAPTA_TEISENDUS --- LIIK, AXAPTA_ID
@Entity
@Getter
@Setter
@Table(name = "IR_AXAPTA_TEISENDUS")
@NoArgsConstructor
public class AxaptaTransformation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_AXAPTA_TEISENDUS")
    private Long id;

    @Column(name = "LIIK", length = 50, nullable = false)
    private String category;

    @Column(name = "AXAPTA_ID", length = 100, nullable = false)
    private String axaptaCode;

    @Column(name = "IR_ID", length = 50, nullable = false)
    private String irId;
}

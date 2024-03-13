package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

// todo primary key to be changed PK_AXAPTA_TEISENDUS --- LIIK, AXAPTA_ID
@Entity
@Table(name = "IR_AXAPTA_TEISENDUS")
@NoArgsConstructor
public class AxaptaTransformation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_AXAPTA_TEISENDUS")
    public Long id;

    @Column(name = "LIIK", length = 50, nullable = false)
    public String category;

    @Column(name = "AXAPTA_ID", length = 100, nullable = false)
    public String axaptaCode;

    @Column(name = "IR_ID", length = 50, nullable = false)
    public String irId;
}

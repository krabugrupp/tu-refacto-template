package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// todo ????? key?? whats' that
@Entity
@Setter
@Getter
@Table(name = "IR_INNERRANGE_ACCESS")
@NoArgsConstructor
public class InnerRangeAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")

    @Column(name = "IR_INNERRANGE_ACCESS_ID", nullable = false)
    private Long id;

    // Basic auth kasutaja
    @Column(name = "USER_NAME", length = 20)
    private String userName;


    // Basic auth parool
    @Column(name = "PASSWORD", length = 20)
    private  String password;

    //API key
    @Column(name = "API_KEY", length = 30)
    private  String apiKey;

}

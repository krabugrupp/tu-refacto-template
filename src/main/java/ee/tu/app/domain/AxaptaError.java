package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "IR_AXAPTA_VEAD")
@NoArgsConstructor
public class AxaptaError {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_AXAPTA_VEAD")
    private Long id;

    @Column(name = "AEG")
    private Date date;

    @Column(name = "TEKST", length = 4000)
    private String text;

    @Column(name = "SESSION_ID")
    private int sessionCode;
}

package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_EHIS_ISIK")
@NoArgsConstructor
public class EhisPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ISIK")
    private Long id;

    @Column(name = "AEG")
    private Date date;

    @Column(name = "VEATEKST", length = 2000)
    private String text;

    // Todo make it some CLOB
    @Column(name = "VASTUS_XML")
    private String sessionCode;
}

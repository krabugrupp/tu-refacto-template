package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_EHIS_ISIK")
@NoArgsConstructor
public class EhisPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ISIK")
    public Long id;

    @Column(name = "AEG")
    public Date date;

    @Column(name = "VEATEKST", length = 2000)
    public String text;

    // Todo make it some CLOB
    @Column(name = "VASTUS_XML")
    public String sessionCode;
}

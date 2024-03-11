package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "IR_ETIS2_UUENDADA")
@NoArgsConstructor
public class Nickname {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ETIS2_UUENDADA")
    public int id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK", nullable = false)
    public Person person;

    @Column(name = "EESNIMI", nullable = false, length = 100)
    public String firstName;

    @Column(name = "PERENIMI", nullable = false, length = 100)
    public String lastName;
}

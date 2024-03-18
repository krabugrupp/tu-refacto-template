package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
// todo whats todo here
@Entity
@Setter
@Getter
@Table(name = "IR_ETIS2_UUENDADA")
@NoArgsConstructor
public class Etis2Update {

    // todo PRIMARY KEY nimetus
    //PK_IR_ETIS2_UUENDADA ID_ISIK, ID_KATEGOORIA
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;
    // Isiku id. Viide ir_isik.id_isik peale

    @Column(name = "ID_ISIK", nullable = false)
    private int personId;

    // Kategooria id. Viide ir_kategooria.id_kategooria peale
    @Column(name = "ID_KATEGOORIA", nullable = false)
    private int categoryId;

    // 1 - kui uuendamine ei õnnestunud, muidu NULL
    @Column(name = "KAS_VIGA")
    private int errorStatus;

    // Lisamise aeg
    @Column(name = "AEG")
    private Date createdAt;

}

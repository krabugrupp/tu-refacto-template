package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
// todo whats todo here
@Entity
@Table(name = "IR_ETIS2_UUENDADA")
@NoArgsConstructor
public class ETIS2Update {

    // todo PRIMARY KEY nimetus
    //PK_IR_ETIS2_UUENDADA ID_ISIK, ID_KATEGOORIA
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    public int id;
    // Isiku id. Viide ir_isik.id_isik peale

    @Column(name = "ID_ISIK", nullable = false)
    public int personId;

    // Kategooria id. Viide ir_kategooria.id_kategooria peale
    @Column(name = "ID_KATEGOORIA", nullable = false)
    public int categoryId;

    // 1 - kui uuendamine ei õnnestunud, muidu NULL
    @Column(name = "KAS_VIGA")
    public int errorStatus;

    // Lisamise aeg
    @Column(name = "AEG")
    public Date createdAt;

}

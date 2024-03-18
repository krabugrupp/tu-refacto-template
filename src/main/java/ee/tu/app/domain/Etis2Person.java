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
@Table(name = "IR_ETIS2_ISIK")
@NoArgsConstructor
public class Etis2Person {

    // Isiku id. Viide ir_isik.id_isik peale
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ISIK")
    private Long id;

    // Isiku kirje ETISe identifikaator.
    @Column(name = "GUID", length = 36)
    private String guid;

    // Muutmise aeg
    @Column(name = "AEG")
    private Date updatedAt;

    // Veatekst, kui etisesse saatmine ebaõnnestub
    @Column(name = "VEATEKST", length = 2000)
    private String errorText;

    // Vastuse XML, kui etisesse saatmine ebaõnnestub
    // Todo clob
    @Column(name = "VASTUS_XML")
    private String responseXml;

}

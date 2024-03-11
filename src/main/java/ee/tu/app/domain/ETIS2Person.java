package ee.tu.app.domain;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;
// todo whats todo here
@Entity
@Table(name = "IR_ETIS2_ISIK")
@NoArgsConstructor
public class ETIS2Person {

    // Isiku id. Viide ir_isik.id_isik peale
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ISIK")
    public int id;

    // Isiku kirje ETISe identifikaator.
    @Column(name = "GUID", length = 36)
    public String guid;

    // Muutmise aeg
    @Column(name = "AEG")
    public Date updatedAt;

    // Veatekst, kui etisesse saatmine ebaõnnestub
    @Column(name = "VEATEKST", length = 2000)
    public String errorText;

    // Vastuse XML, kui etisesse saatmine ebaõnnestub
    // Todo clob
    @Column(name = "VASTUS_XML")
    public String responseXml;

}

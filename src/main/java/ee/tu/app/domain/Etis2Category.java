package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.Date;
// todo whats todo here
@Entity
@Table(name = "IR_ETIS2_KATEGOORIA")
@NoArgsConstructor
public class Etis2Category {

    // Kategooria id. Viide ir_kategooria.id_kategooria peale
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_KATEGOORIA")
    private Long id;

    // Töösuhte kirje ETISe identifikaator.
    @Column(name = "GUID", length = 36)
    private String guid;

    // ETISesse saadetud ir_kategooria.id_alamklass väärtus
    @Column(name = "ID_ALAMKLASS")
    private int subCategoryId;

    // ETISesse saadetud ir_kategooria.eriala väärtus
    @Column(name = "ERIALA", length = 80)
    private String speciality;

    // ETISesse saadetud ir_kategooria.ametinimetus_ik väärtus
    @Column(name = "AMETINIMETUS_IK", length = 200)
    private String jobTitleIk;

    // ETISesse saadetud ir_kategooria.algus_kp väärtus
    @Column(name = "ALGUS_KP")
    private Date dateFrom;

    // ETISesse saadetud ir_kategooria.lopp_kp väärtus
    @Column(name = "LOPP_KP")
    private Date dateTo;

    // ETISesse saadetud ir_kategooria.koomus väärtus
    @Column(name = "KOORMUS")
    private int loadId;

    // Muutmise aeg
    @Column(name = "AEG")
    private Date updatedAt;

    // Veatekst, kui etisesse saatmine ebaõnnestub
    @Column(name = "VEATEKST", length = 2000)
    private String errorText;

    // Vastuse XML, kui etisesse saatmine ebaõnnestub
    @Column(name = "VASTUS_XML")
    private String responseXml;

}

package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_KEEL")
public class LanguageLevel {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KEEL")
    private Long id;

    // Mis isiku keeleoskusega on tegemist
    @JoinColumn(name = "ID_ISIK")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Person person;

    // Keel klassifikaatorist 2
    @Column(name = "KL_KEEL", nullable = false)
    private int language;


    // Keele kõnelemise tase klassifikaatorist 320
    @Column(name = "KL_TASE_KONE", nullable = false)
    private int speakingLevel;

    // Keele kirjutamise tase klassifikaatorist 320
    @Column(name = "KL_TASE_KIRI", nullable = false)
    private int writingLevel;

    // Keele lugemise tase klassifikaatorist 320
    @Column(name = "KL_TASE_LOEB", nullable = false)
    private int readingLevel;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;
}

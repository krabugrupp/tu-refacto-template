package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// Isikute kontaktivahendid
@Entity
@Getter
@Setter
@Table(name = "IR_KONTAKTIVAHENDID",
        // todo Так ставить название праймери ки?
        uniqueConstraints = {@UniqueConstraint(columnNames = {"ID_KONTAKTIVAHEND"}, name = "PK_KONTAKTIVAHENDID")})
public class Contact {


    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KONTAKTIVAHEND")
    private Long id;

    // Millise isiku isikukoodiga on tegemist
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK", nullable = false)
    private Person person;

    // Kontaktivahendi liik klassifikaatorist 114
    @Column(name = "ID_KV_LIIGID", length = 100, nullable = false)
    private int contactCategory;

    // TODO CHECK TYPE
    // Kontaktivahendi väärtus (telefoni number, e-posti aadress jms)
    @Column(name = "TUNNUS1")
    private String value;

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

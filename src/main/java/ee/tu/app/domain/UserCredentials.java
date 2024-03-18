package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_LDAP")
// Tartu Ülikooli keskses süsteemis kehtivad kasutajatunnused
public class UserCredentials {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_LDAP")
    private Long id;

    // Mis isikule antud tunnus kuulub todo user or person?
    @Column(name = "ID_ISIK", nullable = false)
    private int personId;

    // Kasutajatunnus (max 8 märki)
    @Column(name = "KASUTAJATUNNUS", length = 2000, nullable = false)
    private String username;

    // Mis hetkest alates antud tunnus kehtib
    @Column(name = "ALGUS", nullable = false)
    private Date startDate;

    // Kasutajatunnuse lõppemise kuupäev
    @Column(name = "LOPP")
    private Date endDate;
    
    //Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

}

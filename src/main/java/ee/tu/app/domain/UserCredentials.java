package ee.tu.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

// Tartu Ülikooli keskses süsteemis kehtivad kasutajatunnused
public class UserCredentials {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_LDAP")
    public Long id;

    // Mis isikule antud tunnus kuulub todo user or person?
    @Column(name = "ID_ISIK", nullable = false)
    public int personId;

    // Kasutajatunnus (max 8 märki)
    @Column(name = "KASUTAJATUNNUS", length = 2000, nullable = false)
    public String username;

    // Mis hetkest alates antud tunnus kehtib
    @Column(name = "ALGUS", nullable = false)
    public Date startDate;

    // Kasutajatunnuse lõppemise kuupäev
    @Column(name = "LOPP")
    public Date endDate;
    
    //Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

}

package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_LOGI")
public class Log {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_LOGI")
    private Long id;

    // Selle tabeli primaarvõtme väärtus, kus muutus toimus
    @Column(name = "ID_TABEL_RIDA")
    private int tableRowId;

    // Tabeli nimi, kus muutus toimus
    @Column(name = "TABELI_NIMI", length = 30)
    private String tableName;

    // Sündmuse ID: -1=kustutamine, 0=muutmine, 1=lisamine
    @Column(name = "ID_SYNDMUS")
    private int eventId;
    
    // Põhiandmekogumi ID. IR-is tavaliselt id_isik
    @Column(name = "ATRIBUUT", length = 100)
    private String attribute;
    
    // Tabeli rea vana väärtus
    @Column(name = "VANA_VAARTUS", length = 2000)
    private String oldValue;
    
    // Tabeli rea uus väärtus
    @Column(name = "UUS_VAARTUS", length = 2000)
    private String newValue;
    
    // Ei kasutata todo to delete?
    @Column(name = "SELGITUS", length = 255)
    private String explanation;
    
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

package ee.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "IR_LOGI")
public class Log {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_LOGI")
    public int id;

    // Selle tabeli primaarvõtme väärtus, kus muutus toimus
    @Column(name = "ID_TABEL_RIDA")
    public int tableRowId;

    // Tabeli nimi, kus muutus toimus
    @Column(name = "TABELI_NIMI", length = 30)
    public String tableName;

    // Sündmuse ID: -1=kustutamine, 0=muutmine, 1=lisamine
    @Column(name = "ID_SYNDMUS")
    public int eventId;
    
    // Põhiandmekogumi ID. IR-is tavaliselt id_isik
    @Column(name = "ATRIBUUT", length = 100)
    public String attribute;
    
    // Tabeli rea vana väärtus
    @Column(name = "VANA_VAARTUS", length = 2000)
    public String oldValue;
    
    // Tabeli rea uus väärtus
    @Column(name = "UUS_VAARTUS", length = 2000)
    public String newValue;
    
    // Ei kasutata todo to delete?
    @Column(name = "SELGITUS", length = 255)
    public String explanation;
    
    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;
}

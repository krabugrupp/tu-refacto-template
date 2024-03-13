package ee.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

// Abitabel kuupäevadega seotud päringute jaoks
@Entity
@Table(name = "IR_KUUPAEV")
public class HelpDate {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KONTAKTIVAHEND")
    public Long id;

    // Kuupäev
    @Column(name = "KUUPAEV")
    private Date date;

    // Nädalapäev (1-7)
    @Column(name = "KL_NADALAPAEV")
    private int weekDayNmbr;

    // Päeva liik (0=tööpäev, 1=puhkepäev, 2=riiklik püha)
    @Column(name = "KL_PAEVA_LIIK")
    private int dayType;
}

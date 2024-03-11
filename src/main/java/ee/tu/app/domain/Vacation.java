package ee.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

// Vahetabel puhkuste süsteemi ja AXAPTA vahel.
// Siia arvutatakse AXAPTAst iga aasta alguses töötajate selle aasta puhkusejäägid (ja kui juba on, siis ka kasutatud päevade arvu)
// todo weird  PK_IR_PUHKUSED ID_TOOLEPING, AASTA, KL_PUHKUSE_LIIK
@Entity
@Table(name = "IR_PUHKUSED")
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    public int id;
    
    // Millise töölepingu küljes antud puhkus on
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TOOLEPING")
    public EmploymentContract employmentContract;
    
    // Mis aasta puhkusega on tegemist
    @Column(name = "AASTA")
    public int vacationYear;
    
    // Puhkuse liik (klassifikaator id_liik 323)
    @Column(name = "KL_PUHKUSE_LIIK")
    public int vacationType;
    
    // Antud aastas normpäevade arv
    @Column(name = "NORM_PAEVADE_ARV")
    public int daysCount;
    
    // Aastas teenitud päevade arv (norm päevade arv modifitseeritud reaalselt töötatud päevade arvuga)
    @Column(name = "AASTAS_TEENITUD_PAEVADE_ARV")
    public int earnedDaysCount;
    
    // Puhkuse jääk aasta lõpuks
    @Column(name = "PUHKUSE_JAAK")
    public int vacationBalance;
    
    // Kasutatud päevade arv
    @Column(name = "AASTAS_KASUTATUD_PAEVADE_ARV")
    public int usedDaysCount;
    
    // Saldo aegumiskuupäev
    @Column(name = "AEGUMISKUUPAEV")
    public Date expirationDate; 

}

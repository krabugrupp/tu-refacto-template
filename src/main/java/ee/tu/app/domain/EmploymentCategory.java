package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "IR_KATEGOORIA")
@NoArgsConstructor
public class EmploymentCategory {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KATEGOORIA")
    private Long id;

    // Töölepingu tüüp klassifikaatorist 103
    @Column(name = "ID_POHIKLASS")
    private int mainClassId;

    // Ametinimetus, klassifikaator 104 NB! FO enam ei täida, ametinimetus tuleks võtta ametinimetus_ek/ametinimetus_ik väljalt
    @Column(name = "ID_ALAMKLASS")
    private int subClassId;

    // Mis isiku reaga on tegemist // todo viide?
    @JoinColumn(name = "ID_ISIK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Person person;

    // Viide struktuuriüksusele, kus isik töötab todo
    @JoinColumn(name = "ID_STRUKTUUR", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Structure structure;

    // Rea alguskuupäev
    @Column(name = "ALGUS", nullable = false)
    private Date startDate;

    // Rea lõppkuupäev
    @Column(name = "LOPP")
    private Date endDate;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;
    
    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;
    
    // Viide töölepingule, mille alla see rida kuulub
    @JoinColumn(name = "ID_TOOLEPING")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EmploymentContract employmentContract;

    // Tööülesande tüüp klassifikaatorist 290
    @Column(name = "KL_YLESANDE_TYYP")
    private int taskType;

    // Eriala vaba tekstina
    @Column(name = "ERIALA", length = 80)
    private String specialty;

    // Koormus antud real
    @Column(name = "KOORMUS")
    private int workload;

    // Lepingu rea järjestus veebi näitamiseks
    @Column(name = "JARJESTUS")
    private int sequence;

    // Töökoha telefon, tuleb AXAPTAst
    @Column(name = "TOO_TELEFON", length = 20)
    private String workPhone;

    // Töökoha kirjeldus AXAPTAst
    @Column(name = "TOO_KOHT", length = 40)
    private String workplaceDescription;

    // Märkus AXAPTAst veebi kuvamiseks
    @Column(name = "MARKUS", length = 500)
    private String note;

    // Töölepingu rea staatus otse axaptast. Klassifikaator 321
    @Column(name = "KL_STAATUS")
    private int contractLineStatus;

    // AXAPTA JoblevelID väärtus. Siin on kirjas, mis taseme töötajaga on tegemist (juht, dekaan, ...)
    @Column(name = "AXAPTA_JOBLEVELID", length = 10)
    private String axaptaJobLevelId;

    // Ametinimetus Axaptast inglise keeles
    @Column(name = "AMETINIMETUS_IK", length = 200)
    private String jobTitleEN;

    // FO töölepingu rea id
    @Column(name = "CONTRACTLINEID", length = 10)
    private String contractLineId;

    // Ametinimetus eesti keeles FO-st
    @Column(name = "AMETINIMETUS_EK", length = 200)
    private String jobTitleEE;

    // Ingliskeelne märkus FOst veebi kuvamiseks
    @Column(name = "MARKUS_IK", length = 500)
    private String noteEN;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "employmentCategory")
    private List<SalaryData> salaryDataList = new ArrayList<>();
}

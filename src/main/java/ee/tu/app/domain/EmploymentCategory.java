package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "IR_KATEGOORIA")
@NoArgsConstructor
public class EmploymentCategory {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KATEGOORIA")
    public Long id;

    // Töölepingu tüüp klassifikaatorist 103
    @Column(name = "ID_POHIKLASS")
    public int mainClassId;

    // Ametinimetus, klassifikaator 104 NB! FO enam ei täida, ametinimetus tuleks võtta ametinimetus_ek/ametinimetus_ik väljalt
    @Column(name = "ID_ALAMKLASS")
    public int subClassId;

    // Mis isiku reaga on tegemist // todo viide?
    @JoinColumn(name = "ID_ISIK", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Person person;

    // Viide struktuuriüksusele, kus isik töötab todo
    @JoinColumn(name = "ID_STRUKTUUR", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Structure structure;

    // Rea alguskuupäev
    @Column(name = "ALGUS", nullable = false)
    public Date startDate;

    // Rea lõppkuupäev
    @Column(name = "LOPP")
    public Date endDate;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;
    
    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;
    
    // Viide töölepingule, mille alla see rida kuulub
    @JoinColumn(name = "ID_TOOLEPING")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public EmploymentContract employmentContract;

    // Tööülesande tüüp klassifikaatorist 290
    @Column(name = "KL_YLESANDE_TYYP")
    public int taskType;

    // Eriala vaba tekstina
    @Column(name = "ERIALA", length = 80)
    public String specialty;

    // Koormus antud real
    @Column(name = "KOORMUS")
    public int workload;

    // Lepingu rea järjestus veebi näitamiseks
    @Column(name = "JARJESTUS")
    public int sequence;

    // Töökoha telefon, tuleb AXAPTAst
    @Column(name = "TOO_TELEFON", length = 20)
    public String workPhone;

    // Töökoha kirjeldus AXAPTAst
    @Column(name = "TOO_KOHT", length = 40)
    public String workplaceDescription;

    // Märkus AXAPTAst veebi kuvamiseks
    @Column(name = "MARKUS", length = 500)
    public String note;

    // Töölepingu rea staatus otse axaptast. Klassifikaator 321
    @Column(name = "KL_STAATUS")
    public int contractLineStatus;

    // AXAPTA JoblevelID väärtus. Siin on kirjas, mis taseme töötajaga on tegemist (juht, dekaan, ...)
    @Column(name = "AXAPTA_JOBLEVELID", length = 10)
    public String axaptaJobLevelId;

    // Ametinimetus Axaptast inglise keeles
    @Column(name = "AMETINIMETUS_IK", length = 200)
    public String jobTitleEN;

    // FO töölepingu rea id
    @Column(name = "CONTRACTLINEID", length = 10)
    public String contractLineId;

    // Ametinimetus eesti keeles FO-st
    @Column(name = "AMETINIMETUS_EK", length = 200)
    public String jobTitleEE;

    // Ingliskeelne märkus FOst veebi kuvamiseks
    @Column(name = "MARKUS_IK", length = 500)
    public String noteEN;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "employmentCategory")
    private List<SalaryData> salaryDataList = new ArrayList<>();
}

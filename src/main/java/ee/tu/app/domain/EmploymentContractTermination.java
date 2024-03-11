package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.Date;

// Töölepingute peatamised. Tulevad ainult AXAPTAst
@Entity
@Table(name = "IR_TOOLEPING_PEATAMINE")
@NoArgsConstructor
public class EmploymentContractTermination {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_TOOLEPING_PEATAMINE")
    public int id;

    // Mis töölepingu peatamisega on tegemist
    @JoinColumn(name = "ID_TOOLEPING")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public EmploymentContract employmentContract;

    // Töölepingu peatamise liik klassifikaatorist 323
    @Column(name = "KL_PUUDUMISE_LIIK")
    public int terminationType;

    // Töölepingu peatamise alguskuupäev
    @Column(name = "ALGUS_KP")
    public Date startDate;

    // Töölepingu peatamise lõppkuupäev
    @Column(name = "LOPP_KP")
    public Date endDate;

    // Puudumise pikkus päevades
    @Column(name = "PUUDUMISE_PIKKUS")
    public int absenceDuration;

    // Puudumise rea staatus AXAPTAst
    @Column(name = "KL_PUUDUMISE_STAATUS")
    public int axaptaAbsenceStatus;

    // Isiku ID, kes on määratud asendajaks
    @JoinColumn(name = "ID_ISIK_ASENDAJA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Person replacingPerson;

    // Kas tegemist on parandava reaga. Kui jah, siis on puhkuse katkestus ja nullib ära osa või terve puhkuse, mis on näidatud id_parandatav_peatamine sees
    @Column(name = "KAS_PARANDUS")
    public int isCorrection;

    // Kui täidetud, siis on tegemist puhkuse katkestamisega. Viide katkestatavale puhkusele (töölepingu peatamine liigiga 8)
    @Column(name = "ID_PARANDATAV_PEATAMINE")
    public int correctedTerminationId;

    // Kui 1, siis töölepingu peatamine ei ole puhkuseõiguslik
    @Column(name = "KAS_EI_PUHKUSE_OIGUSLIK")
    public int isNonLegalVacation;

    // FO peatamise id
    @Column(name = "ABSENCEID", length = 10)
    public String absenceId;

}

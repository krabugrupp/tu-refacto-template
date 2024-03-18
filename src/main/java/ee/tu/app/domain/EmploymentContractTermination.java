package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

// Töölepingute peatamised. Tulevad ainult AXAPTAst
@Entity
@Getter
@Setter
@Table(name = "IR_TOOLEPING_PEATAMINE")
@NoArgsConstructor
public class EmploymentContractTermination {
    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_TOOLEPING_PEATAMINE")
    private Long id;

    // Mis töölepingu peatamisega on tegemist
    @JoinColumn(name = "ID_TOOLEPING")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EmploymentContract employmentContract;

    // Töölepingu peatamise liik klassifikaatorist 323
    @Column(name = "KL_PUUDUMISE_LIIK")
    private int terminationType;

    // Töölepingu peatamise alguskuupäev
    @Column(name = "ALGUS_KP")
    private Date startDate;

    // Töölepingu peatamise lõppkuupäev
    @Column(name = "LOPP_KP")
    private Date endDate;

    // Puudumise pikkus päevades
    @Column(name = "PUUDUMISE_PIKKUS")
    private int absenceDuration;

    // Puudumise rea staatus AXAPTAst
    @Column(name = "KL_PUUDUMISE_STAATUS")
    private int axaptaAbsenceStatus;

    // Isiku ID, kes on määratud asendajaks
    @JoinColumn(name = "ID_ISIK_ASENDAJA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Person replacingPerson;

    // Kas tegemist on parandava reaga. Kui jah, siis on puhkuse katkestus ja nullib ära osa või terve puhkuse, mis on näidatud id_parandatav_peatamine sees
    @Column(name = "KAS_PARANDUS")
    private int isCorrection;

    // Kui täidetud, siis on tegemist puhkuse katkestamisega. Viide katkestatavale puhkusele (töölepingu peatamine liigiga 8)
    @Column(name = "ID_PARANDATAV_PEATAMINE")
    private int correctedTerminationId;

    // Kui 1, siis töölepingu peatamine ei ole puhkuseõiguslik
    @Column(name = "KAS_EI_PUHKUSE_OIGUSLIK")
    private int isNonLegalVacation;

    // FO peatamise id
    @Column(name = "ABSENCEID", length = 10)
    private String absenceId;

}

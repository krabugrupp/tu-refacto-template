package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

// Kokku aetud topeltisikute IDd
@Entity
@Setter
@Getter
@Table(name = "IR_TOPELT_ISIKUD_LOG")
@NoArgsConstructor
public class DuplicatePersonsLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    //  Vana isiku ID
    @JoinColumn(name = "ID_ISIK_VANA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Person oldPerson;

    //   Uue isiku ID
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK_UUS")
    private Person newPerson;

    // Vana isiku UUID
    @Column(name = "UUID_VANA", length = 40)
    private String oldPersonUUID;

    // Uue isiku UUID
    @Column(name = "UUID_UUS", length = 40)
    private String newPersonUUID;

    // Aeg, millal andmed kokku viidi
    @Column(name = "AEG")
    private Date mergeTime;

}

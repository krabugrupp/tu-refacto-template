package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

// Kokku aetud topeltisikute IDd
@Entity
@Table(name = "IR_TOPELT_ISIKUD_LOG")
@NoArgsConstructor
public class DuplicatePersonsLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    public Long id;

    //  Vana isiku ID
    @JoinColumn(name = "ID_ISIK_VANA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Person oldPerson;

    //   Uue isiku ID
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK_UUS")
    public Person newPerson;

    // Vana isiku UUID
    @Column(name = "UUID_VANA", length = 40)
    public String oldPersonUUID;

    // Uue isiku UUID
    @Column(name = "UUID_UUS", length = 40)
    public String newPersonUUID;

    // Aeg, millal andmed kokku viidi
    @Column(name = "AEG")
    public Date mergeTime;

}

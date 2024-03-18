package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_INNERRANGE_CARD")
@NoArgsConstructor
public class InnerRangeCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_INT")
    private Long id;

    // Kaardi id (guid) inner range andmebaasis - Database ID todo guid???
    @Column(name = "ID", length = 40, nullable = false)
    private String guidId;

    // Kaardiga seotud kasutaja FK  FK_IR_INNERRANGE_CARD_USER_ID
    @Column(name = "USER_ID")
    private int userId;

    // Kaardi number - The Card Number associated with this card.
    @Column(name = "CARD_NUMBER", length = 100)
    private String cardNumber;

    // Kaardi staatus. Huvitab ainult staatus "Active" - Set the status for this Credential
    @Column(name = "STATE", length = 100)
    private String state;

    // Rea viimase muutmise aeg
    @Column(name = "LOADING_DATE")
    @Temporal(TemporalType.DATE)
    private Date loadingDate;

}

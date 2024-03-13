package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_INNERRANGE_CARD")
@NoArgsConstructor
public class InnerRangeCard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_INT")
    public Long id;

    // Kaardi id (guid) inner range andmebaasis - Database ID todo guid???
    @Column(name = "ID", length = 40, nullable = false)
    public String guidId;

    // Kaardiga seotud kasutaja FK  FK_IR_INNERRANGE_CARD_USER_ID
    @Column(name = "USER_ID")
    public int userId;

    // Kaardi number - The Card Number associated with this card.
    @Column(name = "CARD_NUMBER", length = 100)
    public String cardNumber;

    // Kaardi staatus. Huvitab ainult staatus "Active" - Set the status for this Credential
    @Column(name = "STATE", length = 100)
    public String state;

    // Rea viimase muutmise aeg
    @Column(name = "LOADING_DATE")
    @Temporal(TemporalType.DATE)
    public Date loadingDate;

}

package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_ASUTUS_SUHE")
@NoArgsConstructor
public class InstitutionRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ASUTUS_SUHE")
    public int id;

    @Column(name = "ID_ASUTUS_EELLANE")
    public int firstInstitution;

    @Column(name = "ID_ASUTUS_JARGLANE")
    public int secondInstitution;

    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    @Column(name = "KID")
    public String updatedByPerson;

    @Column(name = "AEG")
    public Date updatedAt;

}

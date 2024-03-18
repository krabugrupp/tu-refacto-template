package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
todo 2 PK
PRIMARY KEY nimetus

Veerg

PK_IR_ISIK_TUNNUS

ID_ISIK, TUNNU
 */
@Entity
@Setter
@Getter
@Table(name = "IR_ISIK_TUNNUS")
@NoArgsConstructor
public class PersonAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    // Millise isiku kohta käib tunnus
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ISIK")
    private Person person;

    /*
    Mis tunnusega täpselt tegu :
    - uuendada_ldap: isiku andmed on muutunud, vaja on uuendada tema LDAP kirjeid (iga poole tunni tagant käiv JOB)
    - kas_livelink_kasutaja: kas isikul on kirje livelinki LDAP-is
    - kas_livelink_kasut_kasi: kas isik on pandud käsitsi livelinki kasutajaks
    - akad_tootaja: inimene on akadeemilise aruande kohuslane. See tunnus arvutatakse igal öösel uuesti
    - ldap_number: ülikooli töötajate LDAPis olev isiku identifikaator. Sel juhul on välja "vaartus" vaartuseks see number
    - ok_valjund: isikul on õigus vaadata õppekavade väljundit kõikide õppekavade kohta (väga tähtsad isikud)
    - kuvatav_nimi: isiku display name, mida näidatakse mailhost'i ja exchange'i kaudu kirja saates saatja nimena
     */
    @Column(name = "TUNNUS", length = 20)
    private String attribute;

    // Antud isiku antud tunnuse väärtus. Enamasti seda ei vaadata (väärtuseks on "1") . Tunnuse "ldap_number" korral on siin ka identifikaatori väärtus
    @Column(name = "VAARTUS", length = 200)
    private String value;
}

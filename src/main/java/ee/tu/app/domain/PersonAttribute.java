package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

/*
todo 2 PK
PRIMARY KEY nimetus

Veerg

PK_IR_ISIK_TUNNUS

ID_ISIK, TUNNU
 */
@Entity
@Table(name = "IR_ISIK_TUNNUS")
@NoArgsConstructor
public class PersonAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    public int id;

    // Millise isiku kohta käib tunnus
    @Column(name = "ID_ISIK")
    public int personId;

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
    public String attribute;

    // Antud isiku antud tunnuse väärtus. Enamasti seda ei vaadata (väärtuseks on "1") . Tunnuse "ldap_number" korral on siin ka identifikaatori väärtus
    @Column(name = "VAARTUS", length = 200)
    public String value;
}

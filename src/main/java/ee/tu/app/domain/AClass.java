package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "A_KLASS")
@NoArgsConstructor
public class AClass {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    public Long id;

    //Viide ülemklassifikaatorile (ei kasutata)
    @Column(name = "ID_KLASS")
    public int classId;

    // Viide ülemklassifikaatorile
    @Column(name = "ID_MASTER")
    public int masterId;

    // Klassifikaatori liik (koos koodiga unikaalne)
    @Column(name = "ID_LIIK")
    public int typeId;

    // Klassifikaatori kood (koos liigiga unikaalne)
    @Column(name = "KOOD")
    public int code;

    // Klassifikaatori nimetus väljanäitamiseks eesti keeles
    @Column(name = "NIMETUS", length = 300)
    public String name;

    //Klassifikaatori kehtivuse alguskuupäev (ei vaadata)
    @Column(name = "ALGUS")
    public Date start;

    // Klassifikaatori kehtivuse lõppkuupäev. Kui see on täidetud, siis klassifikaator enam ei kehti.
    @Column(name = "LOPP")
    public Date end;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    // Algväärtus: 1 Viide moodulile, millega antud klassifikaator seotud on
    @Column(name = "ID_MOODUL")
    public int moduleId;

    // Klassifikaatori väärtuse lühend
    @Column(name = "LYHEND", length = 10)
    public String shortName;

    // Klassifikaatori nimetus omastavas käändes
    @Column(name = "NIMETUS_OMASTAV", length = 255)
    public String nameOmastav;

    // Välja näitamisel järjestatakse klassifikaatorid selle veeru järgi. Kui seda ei ole, siis koodi järgi
    @Column(name = "JARJESTUS")
    public int sequence;

    // Klassifikaatori nimetus inglise keeles
    @Column(name = "NIMETUS_IK", length = 255)
    public String nameEn;

    // Klassifikaatori lühend inglise keeles
    @Column(name = "LYHEND_IK", length = 10)
    public String shortNameEn;

    // Tekstiline kood, mida olemasolu korral kasutatakse KOOD asemel [ÕIS2]
    @Column(name = "OIS2KOOD", length = 20)
    public String ois2Code;
}
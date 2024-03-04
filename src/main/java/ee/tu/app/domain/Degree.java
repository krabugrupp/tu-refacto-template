package ee.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

// Hariduste juurde kuuluvad kraadid
@Entity
@Table(name = "IR_KRAAD")
public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KRAAD")
    public int id;

    // Viide asutusele, kes kraadi väljastas (ir_asutus.id_asutus) TODO
    @Column(name = "ID_OMISTAJA")
    public int institutionId;

    // Kraadi liik IR klassifikaatorist 310
    @Column(name = "KL_KRAADI_LIIK")
    public int degreeCategory;

    // Kraadi omistamise kuupäev
    @Column(name = "OMISTATUD")
    public Date dateDegreeGiven;

    // Ei kasutata  todo delete?
    @Column(name = "OMISTAJA_ASUTUS", length = 150)
    public String issuingInstitution;

    //Kraadi nimetus tekstina
    @Column(name = "NIMETUS", length = 255)
    public String degreeName;
    //Kraadi eriala tekstina
    @Column(name = "ERIALA", length = 255)
    public String specialization;

    //Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    //Millise hariduse juurde antud kraad kuulub
    @Column(name = "ID_HARIDUS", nullable = false)
    public int educationId;

    //Kraadi lühend (tuleb nt AXAPTAst)
    @Column(name = "LYHEND", length = 15)
    public String shortName;

    //Axapta kraadi liik klassifikaatorist 109 (admin.a_klass.id_liik = 109). Tuleb ainult Axaptast, vajalik EHIS õppejõudude registri jaoks
    @Column(name = "KL_AXAPTA_KRAADI_LIIK")
    public int axaptaDegreeType;

    //Antud kutse
    @Column(name = "KUTSE", length = 200)
    public String invitation;

    //Kraadi eriala inglise keeles (AXAPTAst)
    @Column(name = "ERIALA_IK", length = 200)
    public String axaptaSpecializationEN;

    //Kraadi lühend inglise keeles (AXAPTAst)
    @Column(name = "LYHEND_IK", length = 15)
    public String axaptaShortnameEN;

    //Lisaks valitav kompetents
    @Column(name = "KOMPETENTS", length = 200)
    public String competence;



}

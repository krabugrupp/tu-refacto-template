package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// Hariduste juurde kuuluvad kraadid
@Entity
@Setter
@Getter
@Table(name = "IR_KRAAD")
public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KRAAD")
    private Long id;

    // Viide asutusele, kes kraadi väljastas (ir_asutus.id_asutus)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OMISTAJA")
    private Institution institution;

    // Kraadi liik IR klassifikaatorist 310
    @Column(name = "KL_KRAADI_LIIK")
    private int degreeCategory;

    // Kraadi omistamise kuupäev
    @Column(name = "OMISTATUD")
    private Date dateDegreeGiven;

    // Ei kasutata  todo delete?
    @Column(name = "OMISTAJA_ASUTUS", length = 150)
    private String issuingInstitution;

    //Kraadi nimetus tekstina
    @Column(name = "NIMETUS", length = 255)
    private String degreeName;

    //Kraadi eriala tekstina
    @Column(name = "ERIALA", length = 255)
    private String specialization;

    //Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    //Millise hariduse juurde antud kraad kuulub
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_HARIDUS", nullable = false)
    private Education education;

    //Kraadi lühend (tuleb nt AXAPTAst)
    @Column(name = "LYHEND", length = 15)
    private String shortName;

    //Axapta kraadi liik klassifikaatorist 109 (admin.a_klass.id_liik = 109). Tuleb ainult Axaptast, vajalik EHIS õppejõudude registri jaoks
    @Column(name = "KL_AXAPTA_KRAADI_LIIK")
    private int axaptaDegreeType;

    //Antud kutse
    @Column(name = "KUTSE", length = 200)
    private String invitation;

    //Kraadi eriala inglise keeles (AXAPTAst)
    @Column(name = "ERIALA_IK", length = 200)
    private String axaptaSpecializationEN;

    //Kraadi lühend inglise keeles (AXAPTAst)
    @Column(name = "LYHEND_IK", length = 15)
    private String axaptaShortnameEN;

    //Lisaks valitav kompetents
    @Column(name = "KOMPETENTS", length = 200)
    private String competence;



}

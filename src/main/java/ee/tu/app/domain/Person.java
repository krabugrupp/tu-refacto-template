package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_ISIK")
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_ISIK", nullable = false)
    public int id;

    // Isiku eesnimi
    @Column(name = "E_NIMI", length = 100)
    public String firstName;

    // Isiku perekonnanimi
    @Column(name = "P_NIMI", length = 100)
    public String lastName;

    // Isiku isanimi, enam ei kasutata // todo to delete?
    @Column(name = "I_NIMI", length = 100)
    public String fatherName;

    // Eesti isikukood, unikaalne
    @Column(name = "ISIKUKOOD", length = 20)
    public String registryCode;

    // Maksuameti kood. Eriti ei kasutata
    @Column(name = "MAKSUAMETI_KOOD", length = 20)
    public String taxInstitutionCode;

    // Isiku sünniaeg
    @Column(name = "SYNNIAEG")
    public Date birthDate;

    // Isiku sugu IR klassifikaatorist 101 (1=mees, 2=naine)
    @Column(name = "SUGU")
    public int sex;

    // Isikuandmete muutmise alus (nt AXAPTA, VV)
    @Column(name = "ALUS", length = 1000)
    public int updateSource;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    // Kodakondsuse id_maad
    @Column(name = "ID_MAAD_KODAKONDSUS")
    public int citizenshipId;

    //Isiku unikaalne ja avalik UUID [ÕIS2]
    @Column(name = "UUID", length = 40)
    public String guid;

    // FO isiku id, muudetakse ainult fo-ir liidese kaudu
    @Column(name = "EMPLID", length = 20)
    public String emplId;
}

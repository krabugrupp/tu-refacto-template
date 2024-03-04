package com.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "IR_KEEL")
public class LanguageLevel {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KEEL")
    public int id;

    // Mis isiku keeleoskusega on tegemist
    @Column(name = "ID_ISIK")
    public int personId;

    // Keel klassifikaatorist 2
    @Column(name = "KL_KEEL", nullable = false)
    public int language;


    // Keele kõnelemise tase klassifikaatorist 320
    @Column(name = "KL_TASE_KONE", nullable = false)
    public int speakingLevel;

    // Keele kirjutamise tase klassifikaatorist 320
    @Column(name = "KL_TASE_KIRI", nullable = false)
    public int writingLevel;

    // Keele lugemise tase klassifikaatorist 320
    @Column(name = "KL_TASE_LOEB", nullable = false)
    public int readingLevel;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public String updatedByPerson;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;
}

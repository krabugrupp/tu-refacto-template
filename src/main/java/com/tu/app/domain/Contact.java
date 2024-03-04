package com.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

// Isikute kontaktivahendid
@Entity
@Table(name = "IR_KONTAKTIVAHENDID")
public class Contact {


    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_KONTAKTIVAHEND")
    public int id;

    // Millise isiku isikukoodiga on tegemist
    @Column(name = "ID_ISIK", nullable = false)
    public int personId;

    // Kontaktivahendi liik klassifikaatorist 114
    @Column(name = "ID_KV_LIIGID", length = 100, nullable = false)
    public int contactCategory;

    // Kontaktivahendi väärtus (telefoni number, e-posti aadress jms)
    @Column(name = "TUNNUS1")
    public Date residencePermitFrom;

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

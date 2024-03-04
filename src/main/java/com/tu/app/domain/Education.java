package com.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_HARIDUS")
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_HARIDUS")
    public int id;

    // Mis isiku haridusega on tegemist
    @Column(name = "ID_ISIK", nullable = false)
    public int personId;

    // Mis asutusest on haridus saadud
    @Column(name = "ID_ASUTUS")
    public int institutionId;

    // IR klassifikaator 250: alg, kesk, korg
    @Column(name = "KL_LIIK")
    public int educationLevel;

    // Haridust tõendava dokumendi number
    @Column(name = "DOKUMENDI_NR", length = 30)
    public String documentNumber;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public int updatedBy;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    // Õppekava nominaalkestus aastates
    @Column(name = "OPPEKAVA_KESTUS")
    public int curriculumDuration;

    // Kui hariduse liik = 2 (kesk), siis klassifikaator 229. Kui hariduse liik = 3 (korg), siis klassifikaator 120
    @Column(name = "KL_OPPEVORM")
    public int educationForm;

    // Hariduse algusaasta
    @Column(name = "ALGUS_AASTA")
    public int startYear;

    // Hariduse lõppaasta
    @Column(name = "LOPP_AASTA")
    public int endYear;

    // todo Omandatud haridustase klassifikaatorist 616 (admin.a_klass id_liik = 616)
    @Column(name = "KL_HARIDUSTASE")
    public int educationLevelClass;

    // todo Keskkoolist saadud medal klassifikaatorist 230 (admin.a_klass id_liik = 230)
    @Column(name = "KL_MEDAL")
    public int medal;

    // Kas ülikool/kõrgkool lõpetati kiitusega
    @Column(name = "KAS_CUM_LAUDE")
    public int isGoldMedal;

    // todo Axapta haridustase klassifikaatorist 108 (admin.a_klass.id_liik = 108). Tuleb ainult Axaptast, vajalik EHIS õppejõudude registri jaoks
    @Column(name = "KL_AXAPTA_HARIDUSTASE")
    public int axaptaEducationLevel;

    // Hariduse andnud asutuse id FO-s
    @Column(name = "EDUCATIONCENTERID", length = 15)
    public String foEducationCenterId;

}

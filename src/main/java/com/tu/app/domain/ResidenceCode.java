package com.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import java.util.Date;

@Entity
@Table(name = "IR_ASUMIKOOD")
@NoArgsConstructor
public class ResidenceCode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ASUMIKOOD")
    public int id;

    @Column(name = "KL_LIIK")
    public int ehakClassifierCode = 220;

    @Column(name = "NIMI", length = 100)
    public String name;

    @Column(name = "URL", length = 50)
    public String updatedByUrl;

    @Column(name = "KID")
    public int updatedByPerson;

    @Column(name = "AEG")
    public Date updatedAt;

    // Todo change to class links

    @Column(name = "ID_VALD")
    public int municipalityId;

    @Column(name = "ID_MAAKOND")
    public int countryId;

    @Column(name = "LOPP_KP")
    public int endAt;


}

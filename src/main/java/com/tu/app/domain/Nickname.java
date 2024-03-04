package com.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;

import java.util.Date;

@Entity
@Table(name = "IR_ETIS2_UUENDADA")
@NoArgsConstructor
public class Nickname {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_ISIK", nullable = false)
    public int id;

    @Column(name = "EESNIMI", nullable = false, length = 100)
    public String firstName;

    @Column(name = "PERENIMI", nullable = false, length = 100)
    public String lastName;
}
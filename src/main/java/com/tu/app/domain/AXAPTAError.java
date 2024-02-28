package com.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "IR_AXAPTA_VEAD")
@NoArgsConstructor
public class AXAPTAError {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "ID_AXAPTA_VEAD")
    public int id;

    @Column(name = "AEG")
    public Date date;

    @Column(name = "TEKST", length = 4000)
    public String text;

    @Column(name = "SESSION_ID")
    public int sessionCode;
}

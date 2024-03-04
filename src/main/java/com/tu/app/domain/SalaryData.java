package com.tu.app.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "IR_PALGAASTE")
public class SalaryData {

    // Tabeli primaarvõti
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID_PALGAASTE")
    public int id;

    // Millise töölepingu rea küljes antud palgaaste on
    @Column(name = "ID_KATEGOORIA")
    public int categoryId;

    // Palgaastme väärtus
    @Column(name = "PALGAASTE")
    public int salary;

    // Palgaastme kehtivuse algus
    @Column(name = "ALGUS_KP")
    public Date startDate;

    // Palgaastme kehtivuse lõpp
    @Column(name = "LOPP_KP")
    public Date endDate;

}
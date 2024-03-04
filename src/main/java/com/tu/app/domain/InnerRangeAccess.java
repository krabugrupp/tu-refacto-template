package com.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

// todo ????? key?? whats' that
@Entity
@Table(name = "IR_INNERRANGE_ACCESS")
@NoArgsConstructor
public class InnerRangeAccess {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")

    @Column(name = "IR_INNERRANGE_ACCESS_ID", nullable = false)
    public int id;

    // Basic auth kasutaja
    @Column(name = "USER_NAME", length = 20)
    public String userName;


    // Basic auth parool
    @Column(name = "PASSWORD", length = 20)
    public  String password;

    //API key
    @Column(name = "API_KEY", length = 30)
    public  String apiKey;

}

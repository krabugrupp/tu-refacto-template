package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Table(name = "IR_INNERRANGE_USER")
@NoArgsConstructor
public class InnerRangeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID", nullable = false)
    public Long id;

    // Kasutaja isikukood
    @Column(name = "ISIKUKOOD", length = 100)
    public String personalCode;

    // Kasutaja eesnimi
    @Column(name = "FIRST_NAME", length = 100)
    public String firstName;

    // Kasutaja perekonnanimi
    @Column(name = "SECOND_NAME", length = 100)
    public String lastName;

    // Kasutaja töötõendi/kaardi number
    @Column(name = "TOOTOENDIKAARDI_NUMBER", length = 50)
    public String workCardNumber;

    // Kasutaja allüksus/asutus
    @Column(name = "ALLUKSUSASUTUS", length = 100)
    public String institutionName;

    // Kasutaja ametikoht
    @Column(name = "AMETIKOHT", length = 100)
    public String position;

    // Kasutaja on tühistatud
    @Column(name = "USER_CANCELLED")
    public boolean cancelled;

    // Kasutaja on aegunud
    @Column(name = "USER_EXPIRED")
    public boolean expired;

    // Rea viimase muutmise aeg
    @Column(name = "LOADING_DATE")
    public Date loadingDate;
}

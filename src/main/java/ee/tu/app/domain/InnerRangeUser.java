package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_INNERRANGE_USER")
@NoArgsConstructor
public class InnerRangeUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @Column(name = "ID", nullable = false)
    private Long id;

    // Kasutaja isikukood
    @Column(name = "ISIKUKOOD", length = 100)
    private String personalCode;

    // Kasutaja eesnimi
    @Column(name = "FIRST_NAME", length = 100)
    private String firstName;

    // Kasutaja perekonnanimi
    @Column(name = "SECOND_NAME", length = 100)
    private String lastName;

    // Kasutaja töötõendi/kaardi number
    @Column(name = "TOOTOENDIKAARDI_NUMBER", length = 50)
    private String workCardNumber;

    // Kasutaja allüksus/asutus
    @Column(name = "ALLUKSUSASUTUS", length = 100)
    private String institutionName;

    // Kasutaja ametikoht
    @Column(name = "AMETIKOHT", length = 100)
    private String position;

    // Kasutaja on tühistatud
    @Column(name = "USER_CANCELLED")
    private boolean cancelled;

    // Kasutaja on aegunud
    @Column(name = "USER_EXPIRED")
    private boolean expired;

    // Rea viimase muutmise aeg
    @Column(name = "LOADING_DATE")
    private Date loadingDate;
}

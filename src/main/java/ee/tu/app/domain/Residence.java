package ee.tu.app.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "IR_AXAPTA_VEAD")
@NoArgsConstructor
public class Residence {

    // Isiku elukoha puhul näitab elukoha liiki klassifikaatorist 100, asutuse aadressi korral 1
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "IR_ELUKOHT")
    private Long id;

    // Kui täidetud, siis on tegemist isiku aadressiga
    @JoinColumn(name = "ID_ISIK")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Person person;

    // todo Aadressi asumikood. Viide ir_asumikood.id_asumikood peale
    @JoinColumn(name = "ID_ASUMIKOOD")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ResidenceCode residenceCode;

    // Aadressi postiindeks
    @Column(name = "POSTIINDEKS")
    private String postalCode;

    // Aadressi tekstiline osa: tänav, maja, korter
    @Column(name = "AADRESS")
    private String address;

    // Todo To be deleted
    // Ei kasutata
    @Column(name = "TANAV", length = 50)
    private String street;

    // Todo To be deleted
    // Ei kasutata
    @Column(name = "MAJA", length = 10)
    private String house;

    // Todo To be deleted
    // Ei kasutata
    @Column(name = "KORTER", length = 10)
    private String flat;

    // Aadressi rea kehtivuse algus
    @Column(name = "ALGUS")
    private Date validFrom;

    // Kui see on täidetud, siis aadress enam ei kehti
    @Column(name = "LOPP")
    private Date validTo;

    // Isiku elukoha puhul näitab elukoha liiki klassifikaatorist 100, asutuse aadressi korral
    @Column(name = "KL_LIIK", nullable = false)
    private Date category;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL")
    private String updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    private int updatedBy;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    private Date updatedAt;

    // Kui täidetud, siis on tegemist asutuse aadressiga
    @JoinColumn(name = "ID_ASUTUS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Institution institution;

    // todo  Mis maaga on tegemist. Viide ir_maad.id_maad peale
    @JoinColumn(name = "ID_MAAD", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    //Aadressi tekstiline osa: linn
    @Column(name = "LINN_TEKSTINA")
    private String cityName;
}

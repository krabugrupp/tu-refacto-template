package ee.tu.app.domain;

import io.swagger.models.auth.In;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "IR_AXAPTA_VEAD")
@NoArgsConstructor
public class Residence {

    // Isiku elukoha puhul näitab elukoha liiki klassifikaatorist 100, asutuse aadressi korral 1
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "IR_ELUKOHT")
    public int id;

    // Kui täidetud, siis on tegemist isiku aadressiga
    @JoinColumn(name = "ID_ISIK")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Person person;

    // todo Aadressi asumikood. Viide ir_asumikood.id_asumikood peale
    @JoinColumn(name = "ID_ASUMIKOOD")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public ResidenceCode residenceCode;

    // Aadressi postiindeks
    @Column(name = "POSTIINDEKS")
    public String postalCode;

    // Aadressi tekstiline osa: tänav, maja, korter
    @Column(name = "AADRESS")
    public String address;

    // Todo To be deleted
    // Ei kasutata
    @Column(name = "TANAV", length = 50)
    public String street;

    // Todo To be deleted
    // Ei kasutata
    @Column(name = "MAJA", length = 10)
    public String house;

    // Todo To be deleted
    // Ei kasutata
    @Column(name = "KORTER", length = 10)
    public String flat;

    // Aadressi rea kehtivuse algus
    @Column(name = "ALGUS")
    public Date validFrom;

    // Kui see on täidetud, siis aadress enam ei kehti
    @Column(name = "LOPP")
    public Date validTo;

    // Isiku elukoha puhul näitab elukoha liiki klassifikaatorist 100, asutuse aadressi korral
    @Column(name = "KL_LIIK", nullable = false)
    public Date category;

    // Rea viimase muutmise teinud arvuti IP aadress. Kui muutus tehti baasist, siis ip ja kasutajatunnus
    @Column(name = "URL")
    public int updatedByUrl;

    // Rea viimase muutja ID_ISIK. Täidetakse logitrigeri poolt
    @Column(name = "KID")
    public Date updatedBy;

    // Rea viimase muutmise aeg. Täidetakse logitrigeri poolt
    @Column(name = "AEG")
    public Date updatedAt;

    // Kui täidetud, siis on tegemist asutuse aadressiga
    @JoinColumn(name = "ID_ASUTUS")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Institution institution;

    // todo  Mis maaga on tegemist. Viide ir_maad.id_maad peale
    @JoinColumn(name = "ID_MAAD", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    public Country country;

    //Aadressi tekstiline osa: linn
    @Column(name = "LINN_TEKSTINA")
    public String cityName;
}

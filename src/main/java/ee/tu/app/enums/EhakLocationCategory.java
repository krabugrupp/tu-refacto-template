package ee.tu.app.enums;

import lombok.Getter;

// Asumite liigid EHAK klassifikaatorist
// Klassifikaatori kood = 220
@Getter
public enum EhakLocationCategory {
    Town (3, "alev"),
    TownWithSimultaneousAdministrativeUnit (4, "linn, samaaegselt haldusüksus"),
    TownAssociatedWithSettlement (5, "linn (asustusüksus)"),
    UrbanArea (6, "linnaosa"),
    Village (7, "alevik"),
    Hamlet (8, "küla"),
    SettlementOrOtherNonMunicipalSettlement (9, "asum või muu omavalitsuseta asustusüksus"),
    County (0, "maakond"),
    Municipality (1, "vald"),
    District (2, "osavald");

    private final int classificator;
    private final String nameEt;

    EhakLocationCategory(int classificator,  String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }

}

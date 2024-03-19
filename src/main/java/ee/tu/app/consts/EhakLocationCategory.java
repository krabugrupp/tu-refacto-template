package ee.tu.app.consts;

// Asumite liigid EHAK klassifikaatorist
// Klassifikaatori kood = 220
public class EhakLocationCategory {
    public static final int TownClassificator = 3;
    public static final String TownNameEt = "alev";

    public static final int TownWithSimultaneousAdministrativeUnitClassificator = 4;
    public static final String TownWithSimultaneousAdministrativeUnitNameEt = "linn, samaaegselt haldusüksus";

    public static final int TownAssociatedWithSettlementClassificator = 5;
    public static final String TownAssociatedWithSettlementNameEt = "linn (asustusüksus)";

    public static final int UrbanAreaClassificator = 6;
    public static final String UrbanAreaNameEt = "linnaosa";

    public static final int VillageClassificator = 7;
    public static final String VillageNameEt = "alevik";

    public static final int HamletClassificator = 8;
    public static final String HamletNameEt = "küla";

    public static final int SettlementOrOtherNonMunicipalSettlementClassificator = 9;
    public static final String SettlementOrOtherNonMunicipalSettlementNameEt = "asum või muu omavalitsuseta asustusüksus";

    public static final int CountyClassificator = 0;
    public static final String CountyNameEt = "maakond";

    public static final int MunicipalityClassificator = 1;
    public static final String MunicipalityNameEt = "vald";

    public static final int DistrictClassificator = 2;
    public static final String DistrictNameEt = "osavald";

}

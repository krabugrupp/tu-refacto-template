package ee.tu.app.consts;

// Töölepingu rea staatus
// Klassifikaatori kood = 321
public class ContractStatus {
    public static final int UnconfirmedClassificator = 0;
    public static final String UnconfirmedNameEt = "kinnitamata";

    public static final int CancelledClassificator = 1;
    public static final String CancelledNameEt = "tühistatud";

    public static final int ActiveClassificator = 2;
    public static final String ActiveNameEt = "aktiivne";

    public static final int SuspendedClassificator = 3;
    public static final String SuspendedNameEt = "peatatud";

    public static final int TerminatedClassificator = 4;
    public static final String TerminatedNameEt = "lõpetatud";
}
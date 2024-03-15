package ee.tu.app.enums;

import lombok.Getter;

// Töölepingu rea staatus
// Klassifikaatori kood = 321
@Getter
public enum ContractStatus {
    Unconfirmed (0, "kinnitamata"),
    Cancelled (1, "tühistatud"),
    Active (2, "aktiivne"),
    Suspended (3, "peatatud"),
    Terminated (4, "lõpetatud");

    private final int classificator;
    private final String nameEt;

    ContractStatus(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}
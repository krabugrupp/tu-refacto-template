package ee.tu.app.enums;

import lombok.Getter;

// Isikute elukohtade liigid
// Klassifikaatori kood = 100
@Getter
public enum AddressType {
    ActualAddress(1, "tegelik aadress"),
    OfficialAddress(2, "ametlik aadress"),
    PlaceOfBirth(3, "sünnikoht"),
    Origin(4, "päritolu"),
    MailingAddress(5, "postiaadress");

    private final int classificator;
    private final String nameEt;

    AddressType(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}

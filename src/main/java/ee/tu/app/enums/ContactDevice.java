package ee.tu.app.enums;

import lombok.Getter;

// Kontaktivahendite liigid
// Klassifikaatori kood = 114
@Getter
public enum ContactDevice {
    WorkPhone (3, "Töötelefon"),
    Fax (4, "Faks tööl"),
    StructureInternetAddress (6, "Struktuuriüksuse internetiaadress"),
    PersonalInternetAddress (7, "Isiklik internetiaadress"),
    MobilePhone (9, "Mobiiltelefon"),
    ProfileNumber (8, "Konto number"),
    InstitutionEmail (100, "Ülikooli e-post"),
    Skype (11, "Skype"),
    WorkMobilePhone (10, "Töö mobiiltelefon"),
    Email (1, "E-post"),
    HomePhone (2, "Kodune telefon");

    private final int classificator;
    private final String nameEt;

    ContactDevice(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}
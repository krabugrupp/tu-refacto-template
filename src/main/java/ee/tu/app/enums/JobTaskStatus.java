package ee.tu.app.enums;

import lombok.Getter;

// Tööülesande liik
// Klassifikaatori kood = 290
@Getter
public enum JobTaskStatus {
    MainJob (100, "Põhitöökoht"),
    AdditionalTask (101, "Lisaülesanne"),
    Fictive (102, "Lisaülesanne");

    private final int classificator;
    private final String nameEt;

    JobTaskStatus(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}
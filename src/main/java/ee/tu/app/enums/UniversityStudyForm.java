package ee.tu.app.enums;

import lombok.Getter;

// Üliõpilase õppevorm
// Klassifikaatori kood = 120
@Getter
public enum UniversityStudyForm {
    Daytime (1, "päevaõpe"),
    Evening (2, "sessioonõpe"),
    ForeignStudent (3, "Välisüliõpilane");

    private final int classificator;
    private final String nameEt;

    UniversityStudyForm(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }

}

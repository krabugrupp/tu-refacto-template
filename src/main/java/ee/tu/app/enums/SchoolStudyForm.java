package ee.tu.app.enums;

import lombok.Getter;

// Õppevorm keskkoolis
// Klassifikaatori kood = 229
@Getter
public enum SchoolStudyForm {
    Daytime (1, "päevane"),
    Evening (2, "õhtune"),
    DistanceLearning (3, "kaugõpe"),
    StateExamTaker (4, "riigieksami sooritaja");

    private final int classificator;
    private final String nameEt;
    SchoolStudyForm(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }

}

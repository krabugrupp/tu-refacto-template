package ee.tu.app.enums;

import lombok.Getter;

// Medal
// Klassifikaatori kood = 230
@Getter
public enum StudyMedal {
    GoldMedal (1, "kuldmedaliga"),
    SilverMedal (2, "hõbemedaliga"),
    VocationalSchoolWithHonors (3, "kutseõppeasutus kiitusega"),
    BestGraduateWithoutMedal (4, "parim lõpetaja (medalita)");

    private final int classificator;
    private final String nameEt;

    StudyMedal(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}

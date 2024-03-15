package ee.tu.app.enums;

import lombok.Getter;

// Isiku sugu
// Klassifikaatori kood = 101
@Getter
public enum Sex {
    Man (1, "mees"),
    Woman (2, "naine"),
    None (3, "*");

    private final int classificator;
    private final String nameEt;

    Sex(int classificator, String nameEt) {

        this.classificator = classificator;
        this.nameEt = nameEt;
    }

}

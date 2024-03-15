package ee.tu.app.enums;

import lombok.Getter;

// Isiku töölepingu põhiklass
// Klassifikaatori kood = 103
@Getter
public enum EmploymentContractType {
    WebsiteGuest (12, "siseveebi külaline"),
    Pensioner (106, "pensionär"),
    EducationalTasksExecutor (107, "õppeülesande täitja"),
    GuestLecturer (108, "külalisõppejõud"),
    Emeritus (109, "emeriit"),
    BenefitRecipient (110, "hüvise saaja"),
    Student (1, "üliõpilane"),
    ForeignStudent (2, "välisüliõpilane"),
    GuestStudent (3, "külalisüliõpilane"),
    ForeignGuestStudent (4,"väliskülalisüliõpilane"),
    InServiceStudent (7, "täiendusõppija"),
    LevelTrainingParticipant (8, "tasemekoolituse õppija"),
    FreeListener (9, "vabakuulaja"),
    Extern (10, "ekstern"),
    ResidentDoctor (11, "arst-resident"),
    EmploymentContract (101, "tööleping"),
    PublicService (102, "avalik teenistus"),
    WorkContract (103, "töövõtuleping"),
    AlimonyRecipient (104, "alimendi saaja"),
    ServiceContract (105, "teenistusleping"),
    Guest (6, "külaline"),
    ResearchScholarship (111, "teadusstipendium"),
    CouncilMember (112, "nõukogu liige"),
    Rent (113, "rent"),
    AuthorContract (114, "autorileping"),
    OtherGrants (115, "muud toetused");

    private final int classificator;
    private final String nameEt;

    EmploymentContractType(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}

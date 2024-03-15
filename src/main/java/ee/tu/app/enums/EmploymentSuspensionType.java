package ee.tu.app.enums;

import lombok.Getter;

//Töölepingu peatamiste liigid
//Klassifikaatori kood = 323
@Getter
public enum EmploymentSuspensionType {

    NonResidentTaxFreeLeave (23, "mitte-residendi puhkus tulumaksuta"),
    AdditionalLeave (20, "lisapuhkus"),
    NonResidentLeaveByForeignTax (22, "mitte-residendi puhkus (tulumaks võõra riigi järgi)"),
    Illness (1, "haigus"),
    PaternityLeave (2, "isapuhkus"),
    EnvironmentalCommissionerAdditionalLeave (3, "keskkonnavoliniku lisapuhkus"),
    ParentalLeave (4, "lapsehoolduspuhkus"),
    ChildcareLeaveUntil31Mar2022 (5, "lapsepuhkus (kuni 31.03.2022)"),
    EmploymentContractSuspended (6, "tööleping peatatud"),
    UnpaidLeave (7, "tasustamata puhkus"),
    MainLeave (8, "põhipuhkus"),
    MaternityAndChildbirthLeave (9, "rasedus- ja sünnituspuhkus"),
    SuspendedWithPreservedSalary (11, "peatatud palga säilitamisega"),
    SelfImprovementLeave (12, "enesetäiendus"),
    UnconfirmedIllness (13, "kinnitamata haigus"),
    ReserveSoldierTraining (14, "reservväelase koolitus"),
    LeaveForWorkEndangeringHealth (15, "puhkus tervistkahjustava töö eest"),
    FreeSemester (16, "vaba semester"),
    StudyLeave (17, "õppepuhkus (keskmine palk)"),
    StudyLeaveMinimumWage (18, "õppepuhkus (miinimumpalk)"),
    UnpaidStudyLeave (19, "õppepuhkus (palgata)"),
    MilitaryService (28, "ajateenistuses viibimine"),
    PartialOrDisabledEmployeeLeave (21, "osalise või puuduva töövõimega töötaja puhkus"),
    DisabledChildParentLeave (24, "puudega lapse vanema puhkus"),
    ChildFeedingBreak (27, "lapsetoitmise vaheaeg"),
    CareLeave (25, "hooldusleht"),
    WorkAccident (26, "tööõnnetus"),
    UnexplainedAbsenceFromWork (29, "töölt põhjuseta puudumine"),
    DefenseLeagueMemberUnpaidAdditionalLeave (30, "kaitseliidu liikme tasustamata lisapuhkus"),
    UnpaidChildcareLeave (31, "tasustamata lapsepuhkus"),
    RectorLeave (33, "rektoripuhkus"),
    SickDays (32, "haiguspäevad"),
    LeaveForCaringForAnAdultWithSevereDisabilities (35, "puhkus täisealise sügava puudega isiku hooldamiseks"),
    ChildcareLeaveFromApril012022 (42, "lapsepuhkus (alates 01.04.2022)"),
    CaretakerLeave (34, "hooldaja puhkus"),
    PartiallyDisabledEmployeeLeave (37, "osalise töövõimega töötaja puhkus"),
    SickDaysInEmergencySituation (36, "Haiguspäevad eriolukorras"),
    FirstDayOfIncapacityForWork (38, "Töövõimetus esimene päev"),
    IncapacityForWork (46, "Töövõimetus"),
    CompensationForAnnualLeave (40, "Põhipuhkuse kompensatsioon"),
    CompensationForExtendedAnnualLeaveForDisabledPensioners (41, "Töövõimetuspensionäri põhipuhkuse pikenduse kompensatsioon"),
    DisabledChildParentChildcareLeave (43, "puudega lapse vanema lapsepuhkus"),
    MaternityLeave (44, "emapuhkus"),
    GrandParentalLeave (45, "vanemapuhkus"),
    AdoptiveParentLeave (47, "lapsendajapuhkus");

    private final int classificator;
    private final String nameEt;

    EmploymentSuspensionType(int classificator, String nameEt) {
        this.classificator = classificator;
        this.nameEt = nameEt;
    }
}

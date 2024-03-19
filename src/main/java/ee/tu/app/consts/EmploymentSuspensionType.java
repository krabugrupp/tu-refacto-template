package ee.tu.app.consts;

import lombok.Getter;

//Töölepingu peatamiste liigid
//Klassifikaatori kood = 323
@Getter
public class EmploymentSuspensionType {
    public static final int NonResidentTaxFreeLeaveClassificator = 23;
    public static final String NonResidentTaxFreeLeaveNameEt = "mitte-residendi puhkus tulumaksuta";

    public static final int AdditionalLeaveClassificator = 20;
    public static final String AdditionalLeaveNameEt = "lisapuhkus";

    public static final int NonResidentLeaveByForeignTaxClassificator = 22;
    public static final String NonResidentLeaveByForeignTaxNameEt = "mitte-residendi puhkus (tulumaks võõra riigi järgi)";

    public static final int IllnessClassificator = 1;
    public static final String IllnessNameEt = "haigus";

    public static final int PaternityLeaveClassificator = 2;
    public static final String PaternityLeaveNameEt = "isapuhkus";

    public static final int EnvironmentalCommissionerAdditionalLeaveClassificator = 3;
    public static final String EnvironmentalCommissionerAdditionalLeaveNameEt = "keskkonnavoliniku lisapuhkus";

    public static final int ParentalLeaveClassificator = 4;
    public static final String ParentalLeaveNameEt = "lapsehoolduspuhkus";

    public static final int ChildcareLeaveUntil31Mar2022Classificator = 5;
    public static final String ChildcareLeaveUntil31Mar2022NameEt = "lapsepuhkus (kuni 31.03.2022)";

    public static final int EmploymentContractSuspendedClassificator = 6;
    public static final String EmploymentContractSuspendedNameEt = "tööleping peatatud";

    public static final int UnpaidLeaveClassificator = 7;
    public static final String UnpaidLeaveNameEt = "tasustamata puhkus";

    public static final int MainLeaveClassificator = 8;
    public static final String MainLeaveNameEt = "põhipuhkus";

    public static final int MaternityAndChildbirthLeaveClassificator = 9;
    public static final String MaternityAndChildbirthLeaveNameEt = "rasedus- ja sünnituspuhkus";

    public static final int SuspendedWithPreservedSalaryClassificator = 11;
    public static final String SuspendedWithPreservedSalaryNameEt = "peatatud palga säilitamisega";

    public static final int SelfImprovementLeaveClassificator = 12;
    public static final String SelfImprovementLeaveNameEt = "enesetäiendus";

    public static final int UnconfirmedIllnessClassificator = 13;
    public static final String UnconfirmedIllnessNameEt = "kinnitamata haigus";

    public static final int ReserveSoldierTrainingClassificator = 14;
    public static final String ReserveSoldierTrainingNameEt = "reservväelase koolitus";

    public static final int LeaveForWorkEndangeringHealthClassificator = 15;
    public static final String LeaveForWorkEndangeringHealthNameEt = "puhkus tervistkahjustava töö eest";

    public static final int FreeSemesterClassificator = 16;
    public static final String FreeSemesterNameEt = "vaba semester";

    public static final int StudyLeaveClassificator = 17;
    public static final String StudyLeaveNameEt = "õppepuhkus (keskmine palk)";

    public static final int StudyLeaveMinimumWageClassificator = 18;
    public static final String StudyLeaveMinimumWageNameEt = "õppepuhkus (miinimumpalk)";

    public static final int UnpaidStudyLeaveClassificator = 19;
    public static final String UnpaidStudyLeaveNameEt = "õppepuhkus (palgata)";

    public static final int MilitaryServiceClassificator = 28;
    public static final String MilitaryServiceNameEt = "ajateenistuses viibimine";

    public static final int PartialOrDisabledEmployeeLeaveClassificator = 21;
    public static final String PartialOrDisabledEmployeeLeaveNameEt = "osalise või puuduva töövõimega töötaja puhkus";

    public static final int DisabledChildParentLeaveClassificator = 24;
    public static final String DisabledChildParentLeaveNameEt = "puudega lapse vanema puhkus";

    public static final int ChildFeedingBreakClassificator = 27;
    public static final String ChildFeedingBreakNameEt = "lapsetoitmise vaheaeg";

    public static final int CareLeaveClassificator = 25;
    public static final String CareLeaveNameEt = "hooldusleht";

    public static final int WorkAccidentClassificator = 26;
    public static final String WorkAccidentNameEt = "tööõnnetus";

    public static final int UnexplainedAbsenceFromWorkClassificator = 29;
    public static final String UnexplainedAbsenceFromWorkNameEt = "töölt põhjuseta puudumine";

    public static final int DefenseLeagueMemberUnpaidAdditionalLeaveClassificator = 30;
    public static final String DefenseLeagueMemberUnpaidAdditionalLeaveNameEt = "kaitseliidu liikme tasustamata lisapuhkus";

    public static final int UnpaidChildcareLeaveClassificator = 31;
    public static final String UnpaidChildcareLeaveNameEt = "tasustamata lapsepuhkus";

    public static final int RectorLeaveClassificator = 33;
    public static final String RectorLeaveNameEt = "rektoripuhkus";

    public static final int SickDaysClassificator = 32;
    public static final String SickDaysNameEt = "haiguspäevad";

    public static final int LeaveForCaringForAnAdultWithSevereDisabilitiesClassificator = 35;
    public static final String LeaveForCaringForAnAdultWithSevereDisabilitiesNameEt = "puhkus täisealise sügava puudega isiku hooldamiseks";

    public static final int ChildcareLeaveFromApril012022Classificator = 42;
    public static final String ChildcareLeaveFromApril012022NameEt = "lapsepuhkus (alates 01.04.2022)";

    public static final int CaretakerLeaveClassificator = 34;
    public static final String CaretakerLeaveNameEt = "hooldaja puhkus";

    public static final int PartiallyDisabledEmployeeLeaveClassificator = 37;
    public static final String PartiallyDisabledEmployeeLeaveNameEt = "osalise töövõimega töötaja puhkus";

    public static final int SickDaysInEmergencySituationClassificator = 36;
    public static final String SickDaysInEmergencySituationNameEt = "Haiguspäevad eriolukorras";

    public static final int FirstDayOfIncapacityForWorkClassificator = 38;
    public static final String FirstDayOfIncapacityForWorkNameEt = "Töövõimetus esimene päev";

    public static final int IncapacityForWorkClassificator = 46;
    public static final String IncapacityForWorkNameEt = "Töövõimetus";

    public static final int CompensationForAnnualLeaveClassificator = 40;
    public static final String CompensationForAnnualLeaveNameEt = "Põhipuhkuse kompensatsioon";

    public static final int CompensationForExtendedAnnualLeaveForDisabledPensionersClassificator = 41;
    public static final String CompensationForExtendedAnnualLeaveForDisabledPensionersNameEt = "Töövõimetuspensionäri põhipuhkuse pikenduse kompensatsioon";

    public static final int DisabledChildParentChildcareLeaveClassificator = 43;
    public static final String DisabledChildParentChildcareLeaveNameEt = "puudega lapse vanema lapsepuhkus";

    public static final int MaternityLeaveClassificator = 44;
    public static final String MaternityLeaveNameEt = "emapuhkus";

    public static final int GrandParentalLeaveClassificator = 45;
    public static final String GrandParentalLeaveNameEt = "vanemapuhkus";

    public static final int AdoptiveParentLeaveClassificator = 47;
    public static final String AdoptiveParentLeaveNameEt = "lapsendajapuhkus";
}

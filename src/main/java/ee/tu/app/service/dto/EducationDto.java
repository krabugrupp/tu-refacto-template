package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDto {

  private DegreeDto degree;

  private String documentNumber;

  private StudyDurationDto duration;

  private ClassificatorDto formHigher;

  private ClassificatorDto formSecondary;

  private EduInstitutionDto institution;

  private boolean isCumLaude;

  private ClassificatorDto medal;

  private ClassificatorDto studyLevel;

  private ClassificatorDto studyType;

}


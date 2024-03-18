package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DegreeDto {

  private TranslationsDto abbreviation;

  private String attributedAt;

  private String attributingInstitution;

  private ClassificatorDto axaptaType;

  private String name;

  private TranslationsDto speciality;

  private ClassificatorDto type;

  private String vocation;
}


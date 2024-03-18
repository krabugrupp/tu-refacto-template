package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EduInstitutionSearchRequestDto {

  private ClassificatorDto category;

  private String erasmusCode;

  private String name;

  private String nameEn;

  private Integer start;

  private Integer take;

  private ClassificatorDto type;
}


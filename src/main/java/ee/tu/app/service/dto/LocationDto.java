package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDto {

  private String code;

  private String parentCode;

  private ClassificatorDto type;

  private TranslationsDto name;
}


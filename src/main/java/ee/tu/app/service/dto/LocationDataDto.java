package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDataDto {

  private String code;

  private TranslationsDto name;

  private String parentCode;

  private ClassificatorDto type;

  private String validUntil;

}


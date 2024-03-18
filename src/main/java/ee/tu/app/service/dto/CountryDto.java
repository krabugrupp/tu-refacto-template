package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDto {

  private TranslationsDto name;

  private String isoCode2;

  private String isoCode3;

}


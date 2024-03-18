package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryDataDto {

  private Integer id;

  private TranslationsDto name;

  private String isoCode2;

  private String isoCode3;

}


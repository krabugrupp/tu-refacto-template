package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StructuralUnitDataDto {

  private boolean academic;

  private String address;

  private String city;

  private String code;

  private String email;

  private Integer level;

  private TranslationsDto name;

  private Integer parentUnitId;

  private String phone;

  private boolean supportsContinuousLearning;

  private String validSince;

  private String validUntil;

  private String webpageUrl;

  private String zip;
}


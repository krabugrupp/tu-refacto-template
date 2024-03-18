package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StructuralUnitDto {

  private String code;

  private TranslationsDto name;

  private String email;

  private String phone;

  private String webpageUrl;

  private String address;

  private String city;

  private String street;

  private String zip;

  private Integer level;

  private boolean academic;

  private boolean supportsContinuousLearning;

  private String parentCode;

  private boolean isExpired;

}


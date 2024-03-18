package ee.tu.app.service.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StructuralUnitSearchDto {

  private boolean academic;

  private String address;

  private String city;

  private String code;

  private String email;

  private boolean isExpired;

  private Integer level;

  private TranslationsSearchDto name;

  private String parentCode;

  private String phone;

  private boolean supportsContinuousLearning;

  private String webpageUrl;

  private String zip;

}


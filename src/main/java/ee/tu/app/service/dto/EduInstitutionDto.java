package ee.tu.app.service.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EduInstitutionDto {

  private String erasmusCode;

  private Integer id;

  private TranslationsDto name;

  private String originalName;

  private String websiteUrl;

  private Integer yearClosed;

}


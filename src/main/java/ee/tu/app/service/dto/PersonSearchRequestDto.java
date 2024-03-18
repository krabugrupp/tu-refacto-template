package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonSearchRequestDto {

  private boolean isActive;

  private boolean isEmployee;

  private boolean isStudent;

  private boolean internal;

  private TranslationsDto jobTitle;

  private String name;

  private Integer start;

}


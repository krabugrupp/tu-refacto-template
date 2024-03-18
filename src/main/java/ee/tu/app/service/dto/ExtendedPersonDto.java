package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtendedPersonDto {

  private String dateOfBirth;

  private String personalId;

  private PersonDto person;
}


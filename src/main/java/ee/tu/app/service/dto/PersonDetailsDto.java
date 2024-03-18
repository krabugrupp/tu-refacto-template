package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDetailsDto {

  private BankAccountDto bank;

  private AddressDto birthplace;

  private CountryDto citizenship;

  private String dateOfBirth;

  private AddressDto origin;

  private String personalCode;

  private ClassificatorDto sex;

}


package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccountUpdateRequestDto {

  private String ownerFirstName;

  private String ownerLastName;

  private String accountNumber;

}


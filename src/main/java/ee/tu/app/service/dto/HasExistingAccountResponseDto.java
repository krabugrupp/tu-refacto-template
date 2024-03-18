package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HasExistingAccountResponseDto {

  private boolean canLogin;

  private boolean hasAccount;

}


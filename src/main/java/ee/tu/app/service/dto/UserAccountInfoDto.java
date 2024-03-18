package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
public class UserAccountInfoDto {

  private List<UserAccountPeriodDto> accounts;

  private List<String> emailAddresses;

  private OffsetDateTime lastPasswordChange;

  private UserStorageDto storage;

  private String username;

}


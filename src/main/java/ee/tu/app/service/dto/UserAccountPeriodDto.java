package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class UserAccountPeriodDto {

  private OffsetDateTime sinceDateTime;

  private OffsetDateTime untilDateTime;

  private String username;

}


package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserStorageDto {

  private Integer limitHardKb;

  private Integer limitSoftKb;

  private Integer usedKb;

}


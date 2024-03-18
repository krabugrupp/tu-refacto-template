package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractSuspensionDto {

  private Integer absenceStatus;

  private String end;

  private Boolean isNotVacation;

  private String start;

  private Integer suspensionLength;

  private ClassificatorDto type;

}


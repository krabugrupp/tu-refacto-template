package ee.tu.app.service.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class WorkContractDto {

  private LocalDate signingDate;

  private String number;

  private LocalDate start;

  private LocalDate end;

}


package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StructuralUnitSearchRequestSearchDto {

  private String code;

  private Boolean isAcademic;

  private Boolean isTraining;

  private Integer level;

  private String name;

  private String q;

  private Integer start;

  private Integer take;

}


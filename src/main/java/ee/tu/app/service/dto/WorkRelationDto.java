package ee.tu.app.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class WorkRelationDto {

  private String beginning;

  private ClassificatorDto category;

  private WorkContractDto contract;

  private String end;

  private String joblevelId;

  private BigDecimal load;

  private String note;

  private String phone;

  private String speciality;

  private ClassificatorDto state;

  private StructuralUnitDto structuralUnit;

  private List<ContractSuspensionDto> suspensions;

  private ClassificatorDto task;

  private TranslationsDto title;

}


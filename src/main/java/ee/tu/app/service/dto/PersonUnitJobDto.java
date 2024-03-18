package ee.tu.app.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

@Getter
@Setter
public class PersonUnitJobDto {

  private TranslationsDto jobCategory;

  private TranslationsDto jobTitle;

  private String structuralUnitCode;

  private TranslationsDto structuralUnitName;

}


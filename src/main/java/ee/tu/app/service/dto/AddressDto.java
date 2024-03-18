package ee.tu.app.service.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

  private ClassificatorDto type;

  private CountryDto country;

  private LocationDto location;

  private String locationPlainText;

  private String postalCode;

  private String address;

  private EduInstitutionDto institution;


}


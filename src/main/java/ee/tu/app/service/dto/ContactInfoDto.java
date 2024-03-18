package ee.tu.app.service.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ContactInfoDto {

  private List<ContactDeviceDto> devices;
  private List<TranslationsDto> addresses;

}


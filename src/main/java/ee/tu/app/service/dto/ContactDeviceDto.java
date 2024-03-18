package ee.tu.app.service.dto;

import ee.tu.app.domain.Contact;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDeviceDto {

  private ClassificatorDto type;

  private String value;

  public static ContactDeviceDto createDto(Contact contact) {
    ContactDeviceDto contactInfoDto = new ContactDeviceDto() {{
      setValue(contact.getValue());
//      setType(new ClassificatorDto(){{
//        setCode(contact.getContactCategory());
//      }});
    }};

    return contactInfoDto;
  }
}


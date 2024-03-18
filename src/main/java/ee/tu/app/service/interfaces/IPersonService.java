package ee.tu.app.service.interfaces;

import ee.tu.app.api.model.*;
import ee.tu.app.service.dto.*;

import java.util.List;

public interface IPersonService {

     UserAccountInfoDto getPersonAccountInfoByPersonUuid(String personUuid);
     ContactInfoDto getPersonContactsPersonUuid(String personUuid);
     PersonDetailsDto getPersonDetailsByPersonUuid(String personUuid);
     List<EducationDto> getPersonEducationByUuid(String personUuid);
     PersonDto getPersonByPersonUuid(String personUuid);
     List<WorkRelationDto> getPersonWorkRelationsByPersonUuid(String personUuid);
     void savePersonDetailsBank(String personUuid, BankAccountDto BankAccountDto);
     List<PersonDto> getPersonsBySearchRequest(PersonSearchRequestDto PersonSearchRequestDto);
     void updatePersonContacts(String personUuid, ContactInfoUpdateRequestDto ContactInfoUpdateRequestDto);
}

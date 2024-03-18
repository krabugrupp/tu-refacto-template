package ee.tu.app.service;

import ee.tu.app.api.model.XRContactInfoUpdateRequest;
import ee.tu.app.api.model.XRPerson;
import ee.tu.app.api.model.XRPersonSearchRequest;
import ee.tu.app.domain.Contact;
import ee.tu.app.domain.Person;
import ee.tu.app.enums.ContactDevice;
import ee.tu.app.errors.TuAppServiceException;
import ee.tu.app.repo.PersonRepo;
import ee.tu.app.service.dto.*;
import ee.tu.app.service.interfaces.IPersonService;
import ee.tu.app.service.todelete.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;

import static ee.tu.app.errors.Errors.ERROR_NOT_FOUND;

@Service
@Transactional
public class PersonService extends BaseService<Person> implements IPersonService {

    public PersonService(PersonRepo repository) {
        super(repository);
    }

    public PersonDto getPersonByUuid(String uuid) {
       Person person =  ((PersonRepo) repository).findPersonByUuid(uuid)
               .orElseThrow(() -> new TuAppServiceException(ERROR_NOT_FOUND.getCode(), String.format("No person with uuid {%s} found", uuid)));
       PersonDto personDto = new PersonDto(){{
           setId(person.getId());
           setFirstName(person.getFirstName());
           setLastName(person.getLastName());
           setFullName(person.getFullName());
       }};

        for (Contact contact : person.getPersonContactList() ) {
            if (ContactDevice.Email.getClassificator() == contact.contactCategory) {
                personDto.setOfficialEmail(contact.value);

            }
            else if (ContactDevice.Fax.getClassificator() == contact.contactCategory) {
                personDto.setOfficialFax(contact.value);

            }
            else if (ContactDevice.WorkMobilePhone.getClassificator() == contact.contactCategory) {
                personDto.setOfficialMobile(contact.value);

            }
            else if (ContactDevice.MobilePhone.getClassificator() == contact.contactCategory) {
                personDto.setPersonalPhone(contact.value);

            }
            else if (ContactDevice.HomePhone.getClassificator() == contact.contactCategory) {
                personDto.setPersonalPhone(contact.value);

            }
        }

       return personDto;
    }


    @Override
    public UserAccountInfoDto getPersonAccountInfoByPersonUuid(String personUuid) {
        return null;
    }

    @Override
    public ContactInfoDto getPersonContactsPersonUuid(String personUuid) {
        return null;
    }

    @Override
    public PersonDetailsDto getPersonDetailsByPersonUuid(String personUuid) {
        return null;
    }

    @Override
    public List<EducationDto> getPersonEducationByUuid(String personUuid) {
        return null;
    }

    @Override
    public PersonDto getPersonByPersonUuid(String personUuid) {
        return null;
    }

    @Override
    public List<WorkRelationDto> getPersonWorkRelationsByPersonUuid(String personUuid) {
        return null;
    }

    @Override
    public void savePersonDetailsBank(String personUuid, BankAccountDto BankAccountDto) {

    }

    @Override
    public List<PersonDto> getPersonsBySearchRequest(PersonSearchRequestDto PersonSearchRequestDto) {
        return null;
    }

    @Override
    public void updatePersonContacts(String personUuid, ContactInfoUpdateRequestDto ContactInfoUpdateRequestDto) {

    }
}
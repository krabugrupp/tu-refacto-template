package ee.tu.app.service;

import ee.tu.app.domain.Contact;
import ee.tu.app.domain.Person;
import ee.tu.app.consts.ContactDevice;
import ee.tu.app.errors.TuAppServiceException;
import ee.tu.app.repo.PersonRepo;
import ee.tu.app.service.dto.*;
import ee.tu.app.service.interfaces.IPersonService;
import ee.tu.app.service.todelete.BaseService;
import jakarta.transaction.Transactional;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

import static ee.tu.app.errors.Errors.ERROR_NOT_FOUND;

@Service
@Transactional
public class PersonService extends BaseService<Person> implements IPersonService {

    public PersonService(PersonRepo repository) {
        super(repository);
    }


    @Override
    public PersonDto getPersonByPersonUuid(String personUuid) {
       Person person =  ((PersonRepo) repository).findPersonByUuid(personUuid)
               .orElseThrow(() -> new TuAppServiceException(ERROR_NOT_FOUND, String.format("No person with uuid {%s} found", personUuid)));
       PersonDto personDto = new PersonDto(){{
           setId(person.getId());
           setFirstName(person.getFirstName());
           setLastName(person.getLastName());
           setFullName(person.getFullName());
       }};
        for (Contact contact : person.getPersonContactList() ) {
            switch (contact.getContactCategory()) {
                case ContactDevice.EmailClassificator:
                    personDto.setOfficialEmail(contact.getValue());
                    break;
                case ContactDevice.FaxClassificator:
                    personDto.setOfficialFax(contact.getValue());
                    break;
                case ContactDevice.WorkMobilePhoneClassificator:
                    personDto.setOfficialMobile(contact.getValue());
                    break;
                case ContactDevice.WorkPhoneClassificator:
                    personDto.setOfficialPhone(contact.getValue());
                    break;
                case ContactDevice.MobilePhoneClassificator:
                    personDto.setPersonalPhone(contact.getValue());
                    break;
            }
        }

       return personDto;
    }


    @Override
    public UserAccountInfoDto getPersonAccountInfoByPersonUuid(String personUuid) {

        UserAccountInfoDto userAccountInfoDto = new UserAccountInfoDto(){{

        }};

        throw new NotImplementedException();

    }

    @Override
    public ContactInfoDto getPersonContactsPersonUuid(String personUuid) {

        Person person =  ((PersonRepo) repository).findPersonByUuid(personUuid)
                .orElseThrow(() -> new TuAppServiceException(ERROR_NOT_FOUND, String.format("No person with uuid {%s} found", personUuid)));
        ContactInfoDto contactInfoDto = new ContactInfoDto(){{
            // Todo make it to contact device
//            setDevices(person.getPersonContactList());
        }};

        throw new NotImplementedException();

    }

    @Override
    public PersonDetailsDto getPersonDetailsByPersonUuid(String personUuid) {
        PersonDetailsDto personDetailsDto = new PersonDetailsDto(){{

        }};

        throw new NotImplementedException();

    }

    @Override
    public List<EducationDto> getPersonEducationByUuid(String personUuid) {
        List<EducationDto> educationDtoList = new ArrayList<>();

        throw new NotImplementedException();

    }


    @Override
    public List<WorkRelationDto> getPersonWorkRelationsByPersonUuid(String personUuid) {
        List<WorkRelationDto> workRelationDtoList = new ArrayList<>();

        throw new NotImplementedException();

    }

    @Override
    public void savePersonDetailsBank(String personUuid, BankAccountDto BankAccountDto) {


        throw new NotImplementedException();
    }

    @Override
    public List<PersonDto> getPersonsBySearchRequest(PersonSearchRequestDto PersonSearchRequestDto) {
        List<PersonDto> personDtoList = new ArrayList<>();
        throw new NotImplementedException();

    }

    @Override
    public void updatePersonContacts(String personUuid, ContactInfoUpdateRequestDto ContactInfoUpdateRequestDto) {
        throw new NotImplementedException();

    }
}
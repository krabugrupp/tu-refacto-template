package ee.tu.app.web.rest;

import ee.tu.app.api.PersonApiDelegate;
import ee.tu.app.api.model.*;
import ee.tu.app.errors.TuAppServiceException;
import ee.tu.app.service.PersonService;
import ee.tu.app.service.dto.*;
import ee.tu.app.web.rest.mapper.PersonXrMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 */
@Component
@Slf4j
public class PersonApi implements PersonApiDelegate {

    private final PersonService personService;
    private final PersonXrMapper mapper;

    public PersonApi(PersonService personService, PersonXrMapper mapper) {
        this.personService = personService;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<XRUserAccountInfo> getPersonAccountInfo(String personUuid) {
        log.info("Get person account info is accessed");
        try {
            UserAccountInfoDto userAccountInfoDto = personService.getPersonAccountInfoByPersonUuid(personUuid);
            return ResponseEntity.of(Optional.ofNullable(mapper.toXr(userAccountInfoDto)));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<XRContactInfo> getPersonContacts(String personUuid) {
        log.info("Get person contracts is accessed");
        try {
            ContactInfoDto contactInfoDto = personService.getPersonContactsPersonUuid(personUuid);
            return ResponseEntity.of(Optional.ofNullable(mapper.toXr(contactInfoDto)));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<XRPersonDetails> getPersonDetails(String personUuid) {
        log.info("Get person details is accessed");
        try {
            PersonDetailsDto personDetailsDto = personService.getPersonDetailsByPersonUuid(personUuid);
            return ResponseEntity.of(Optional.ofNullable(mapper.toXr(personDetailsDto)));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<List<XREducation>> getPersonEducation(String personUuid) {
        log.info("Get person education is accessed");
        try {
            List<EducationDto> educationDtoList = personService.getPersonEducationByUuid(personUuid);
            return ResponseEntity.of(Optional.of(educationDtoList.stream().map(mapper::toXr).collect(Collectors.toList())));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<XRPerson> getPersonInfo(String personUuid) {
        log.info("Get person account info is accessed");
        try {
            PersonDto personDto = personService.getPersonByPersonUuid(personUuid);
            return ResponseEntity.of(Optional.ofNullable(mapper.toXr(personDto)));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
                return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<List<XRWorkRelation>> getPersonWorkRelations(String personUuid) {
        log.info("Get person work relations is accessed");
        try {
            List<WorkRelationDto> workRelationDtoList = personService.getPersonWorkRelationsByPersonUuid(personUuid);
            return ResponseEntity.of(Optional.of(workRelationDtoList.stream().map(mapper::toXr).collect(Collectors.toList())));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Void> postPersonDetailsBank(String personUuid, XRBankAccount xrBankAccount) {
        log.info("Post person details bank is accessed");
        try {
            BankAccountDto bankAccountDto = mapper.toDto(xrBankAccount);
            personService.savePersonDetailsBank(personUuid, bankAccountDto);
            // Todo make .created()
            return ResponseEntity.ok().build();

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<List<XRPerson>> searchPersons(XRPersonSearchRequest xrPersonSearchRequest) {
        log.info("Get all persons by request is accessed");
        try {
            PersonSearchRequestDto requestDto = mapper.toDto(xrPersonSearchRequest);
            List<PersonDto> educationDtoList = personService.getPersonsBySearchRequest(requestDto);
            return ResponseEntity.of(Optional.of(educationDtoList.stream().map(mapper::toXr).collect(Collectors.toList())));

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<Void> updatePersonContacts(String personUuid, XRContactInfoUpdateRequest xrContactInfoUpdateRequest) {
        log.info("Update person contact is accessed");
        try {
            ContactInfoUpdateRequestDto contactInfoUpdateRequestDto = mapper.toDto(xrContactInfoUpdateRequest);
            personService.updatePersonContacts(personUuid, contactInfoUpdateRequestDto);
            // Todo make .created()
            return ResponseEntity.ok().build();

        } catch (TuAppServiceException e) {
            log.error(e.getError());
            return ResponseEntity.notFound().build();
        }
    }



}




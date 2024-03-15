package ee.tu.app.web.rest;

import ee.tu.app.api.PersonApiDelegate;
import ee.tu.app.api.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 */
@Component
@Slf4j
public class PersonApi implements PersonApiDelegate {

    @Override
    public ResponseEntity<XRUserAccountInfo> getPersonAccountInfo(String personUuid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<XRContactInfo> getPersonContacts(String personUuid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<XRPersonDetails> getPersonDetails(String personUuid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<XREducation>> getPersonEducation(String personUuid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<XRPerson> getPersonInfo(String personUuid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<XRWorkRelation>> getPersonWorkRelations(String personUuid) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> postPersonDetailsBank(String personUuid, XRBankAccount xrBankAccount) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<XRPerson>> searchPersons(XRPersonSearchRequest xrPersonSearchRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> updatePersonContacts(String personUuid, XRContactInfoUpdateRequest xrContactInfoUpdateRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }



}




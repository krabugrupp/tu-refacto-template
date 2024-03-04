package ee.tu.app.web.rest;

import ee.tu.app.api.PersonApiDelegate;
import ee.tu.app.api.model.XRPerson;
import ee.tu.app.api.model.XRPersonCitizenship;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

/*
 */
@Component
public class PersonApi implements PersonApiDelegate {

    private final Logger log = LoggerFactory.getLogger(PersonApi.class);

    @Override
    public ResponseEntity<List<XRPersonCitizenship>> getCitizenship() {


        return ResponseEntity.ok(null);
    }


    @Override
    public ResponseEntity<XRPerson> getPerson() {
        log.info("Get resource was requested");
        XRPerson person = new XRPerson();
        person.setId(1);
        person.setName("Peeter");
        person.setLastName("Peetrovi4");
        person.setFatherName("Peetrov");
        person.setRegistryCode("39923131113");
        person.setMaksuametCode("7890");
        person.setBirthDate(LocalDate.now());
        person.setSex(1);
        person.setSomeAlus("Some info");
        person.setUrl("http://google.com");
        person.setKid(1);
        person.setUpdatedAt(LocalDate.now());
        person.setCitizenship(1);
        person.setUuid("uuid1");
        person.setEmplid("emplid123");

        return ResponseEntity.ok(person);
    }
}




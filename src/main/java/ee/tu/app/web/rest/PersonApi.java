package ee.tu.app.web.rest;

import ee.tu.app.api.PersonApiDelegate;
import ee.tu.app.api.model.XRPerson;
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
    public ResponseEntity<XRPerson> getPerson() {
        log.info("Get resource was requested");
        XRPerson person = new XRPerson();
        person.setId(1L);
        person.setFirstName("Peeter");
        person.setLastName("Peetrovi4");

        person.setUuid("uuid1");

        return ResponseEntity.ok(person);
    }
}




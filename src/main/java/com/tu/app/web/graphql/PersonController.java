package com.tu.app.web.graphql;

import com.tu.app.api.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;


@Controller
public class PersonController {
    private final Logger log = LoggerFactory.getLogger(PersonController.class);


    @QueryMapping(name = "person")
    public Person getPerson() {
        log.info("Get resource was requested");
        Person person = new Person();
        person.setId(1);
        person.setName("Peeter");
        person.setForename("Peetrovi4");
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
        return person;
    }
}
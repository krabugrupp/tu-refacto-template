package com.tu.app.web.rest;

import com.tu.app.api.PersonCitizenshipApiDelegate;
import com.tu.app.api.model.PersonCitizenship;
import com.tu.app.web.graphql.PersonController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonCitizenshipResource implements PersonCitizenshipApiDelegate {

    private final Logger log = LoggerFactory.getLogger(PersonCitizenshipResource.class);

    @Override
    public ResponseEntity<List<PersonCitizenship>> getCitizenship() {
        log.info("Get resource was requested");

        return ResponseEntity.ok(
              new ArrayList<PersonCitizenship>() {{ }}
        );

    }
}

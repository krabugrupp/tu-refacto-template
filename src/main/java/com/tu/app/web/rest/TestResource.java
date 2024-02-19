package com.tu.app.web.rest;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class TestResource {
    private static final Logger log = LoggerFactory.getLogger(TestResource.class);

    @GetMapping("/hello")
    public ResponseEntity<String> getAll() {
        log.debug("GET api/hello is accessed");
        return ResponseEntity.ok("Hello!");
    }

}


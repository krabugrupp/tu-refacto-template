package com.tu.app.web.rest;

import com.tu.app.api.PrivetApiDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivetResource implements PrivetApiDelegate {
    @Override
    public ResponseEntity<String> getPrivet() {
        return ResponseEntity.ok("privet");

    }
}

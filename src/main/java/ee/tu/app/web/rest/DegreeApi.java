package ee.tu.app.web.rest;

import ee.tu.app.api.DegreeApiDelegate;
import ee.tu.app.api.model.XRDegree;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DegreeApi implements DegreeApiDelegate {

    @Override
    public ResponseEntity<XRDegree> getDegree() {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}

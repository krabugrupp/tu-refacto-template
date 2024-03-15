package ee.tu.app.web.rest;

import ee.tu.app.api.ApiUtil;
import ee.tu.app.api.ClassificatorApiDelegate;
import ee.tu.app.api.model.XRClassificator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClassificatorApi implements ClassificatorApiDelegate {

    @Override
    public ResponseEntity<XRClassificator> getClassificator() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}

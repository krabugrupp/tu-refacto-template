package ee.tu.app.web.rest;

import ee.tu.app.api.ApiUtil;
import ee.tu.app.api.PersonRegistryApiDelegate;
import ee.tu.app.api.model.XRHasExistingAccountResponse;
import ee.tu.app.api.model.XRValidatePersonRegistryParamsParameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PersonRegistryApi implements PersonRegistryApiDelegate {

    @Override
    public ResponseEntity<XRHasExistingAccountResponse> validatePersonRegistry(XRValidatePersonRegistryParamsParameter params) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}

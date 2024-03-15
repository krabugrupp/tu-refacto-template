package ee.tu.app.web.rest;

import ee.tu.app.api.EduInstitutionApiDelegate;
import ee.tu.app.api.model.XREduInstitution;
import ee.tu.app.api.model.XREduInstitutionSearchRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class EduInstitutionApi implements EduInstitutionApiDelegate {

    @Override
    public ResponseEntity<List<XREduInstitution>> getAllEducationalInstitutions() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<XREduInstitution> getEducationalInstitutionById(Integer id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<Map<String, String>> getEducationalInstitutionNamesInEnglish() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<Map<String, String>> getEducationalInstitutionNamesInEstonian() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XREduInstitution>> searchEducationalInstitutions(XREduInstitutionSearchRequest xrEduInstitutionSearchRequest) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}


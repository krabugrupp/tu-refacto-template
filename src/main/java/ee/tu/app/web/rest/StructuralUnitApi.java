package ee.tu.app.web.rest;

import ee.tu.app.api.StructuralUnitApiDelegate;
import ee.tu.app.api.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class StructuralUnitApi implements StructuralUnitApiDelegate {

    @Override
    public ResponseEntity<List<XRStructuralUnit>> getAllAcademicInstitutes() {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XRStructuralUnit>> getAllAcademicStructuralUnits() {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<Map<String, String>> getAllStructuralUnitNamesInLang(String lang) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XRStructuralUnitPublic>> getAllStructuralUnits() {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XRStructuralUnitData>> getAllStructuralUnitsFullDetails() {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XRStructuralUnitPublic>> getChildUnitsOfStructuralUnit(String unitCode) {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<Map<String, String>> getChildUnitsOfStructuralUnitInLang(String unitCode, String lang) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XRStructuralUnit>> getContinuousLearningStructuralUnits() {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<XRStructuralUnitPublic> getStructuralUnitDetails(String unitCode) {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<List<XRStructuralUnitSearch>> searchStructuralUnits(XRStructuralUnitSearchRequestSearch xrStructuralUnitSearchRequestSearch) {

        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}


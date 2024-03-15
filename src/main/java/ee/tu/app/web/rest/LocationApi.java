package ee.tu.app.web.rest;

import ee.tu.app.api.LocationApiDelegate;
import ee.tu.app.api.model.XRCountry;
import ee.tu.app.api.model.XRCountryData;
import ee.tu.app.api.model.XRLocation;
import ee.tu.app.api.model.XRLocationData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Generated;
import java.util.List;

@Component
@Slf4j
public class LocationApi implements LocationApiDelegate {

    @Override
    public  ResponseEntity<List<XRCountryData>> exportAllCountries() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<List<XRLocationData>> exportAllLocations() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<List<XRCountry>> getAllCountries() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<List<XRLocation>> getAllLocationsByCountry(String countryCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<List<XRLocation>> getAllLocationsByCountryAndLocation(String countryCode, String locationCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<XRCountry> getCountryDetails(String countryCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<List<XRLocation>> getCountrySubLocations(String countryCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<XRLocation> getLocationDetails(String countryCode, String locationCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public  ResponseEntity<List<XRLocation>> getLocationSubLocations(String countryCode, String locationCode) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}

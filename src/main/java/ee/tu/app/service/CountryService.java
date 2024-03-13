package ee.tu.app.service;

import ee.tu.app.domain.Country;
import ee.tu.app.repo.CountryRepo;

public class CountryService extends BaseService<Country, CountryRepo> {


    public CountryService(CountryRepo repository) {
        super(repository);
    }
}

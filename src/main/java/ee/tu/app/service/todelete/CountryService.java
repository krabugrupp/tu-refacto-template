package ee.tu.app.service.todelete;

import ee.tu.app.domain.Country;
import ee.tu.app.repo.CountryRepo;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseService<Country> {


    public CountryService(CountryRepo repository) {
        super(repository);
    }
}

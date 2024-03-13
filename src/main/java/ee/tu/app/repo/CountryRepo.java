package ee.tu.app.repo;

import ee.tu.app.domain.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends IBaseRepo<Country, Long> {


}

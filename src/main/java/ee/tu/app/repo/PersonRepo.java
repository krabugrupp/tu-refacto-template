package ee.tu.app.repo;

import ee.tu.app.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends IBaseRepo<Person, Long> {

}

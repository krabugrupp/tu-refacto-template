package ee.tu.app.repo;

import ee.tu.app.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepo extends IBaseRepo<Person, Long> {

    Optional<Person> findPersonByUuid(String uuid);
}

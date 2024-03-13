package ee.tu.app.repo;


import ee.tu.app.domain.PersonAttribute;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonAttributeRepo extends IBaseRepo<PersonAttribute, Long> {

}

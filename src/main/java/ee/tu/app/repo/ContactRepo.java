package ee.tu.app.repo;

import ee.tu.app.domain.Contact;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepo extends IBaseRepo<Contact, Long > {


}

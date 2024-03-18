package ee.tu.app.service.todelete;


import ee.tu.app.domain.PersonAttribute;
import ee.tu.app.repo.PersonAttributeRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonAttributeService extends BaseService<PersonAttribute> {

    public PersonAttributeService(PersonAttributeRepo repository) {
        super(repository);
    }
}

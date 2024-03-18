package ee.tu.app.service.todelete;

import ee.tu.app.domain.Contact;
import ee.tu.app.repo.ContactRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContactService extends BaseService<Contact> {


    public ContactService(ContactRepo repository) {
        super(repository);
    }
}

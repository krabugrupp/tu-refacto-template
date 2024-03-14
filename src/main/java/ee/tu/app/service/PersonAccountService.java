package ee.tu.app.service;

import ee.tu.app.domain.PersonAccount;
import ee.tu.app.repo.PersonAccountRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonAccountService extends BaseService<PersonAccount> {

    public PersonAccountService(PersonAccountRepo repository) {
        super(repository);
    }
}

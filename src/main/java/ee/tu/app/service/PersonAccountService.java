package ee.tu.app.service;

import ee.tu.app.domain.PersonAccount;
import ee.tu.app.repo.PersonAccountRepo;


public class PersonAccountService extends BaseService<PersonAccount, PersonAccountRepo> {

    public PersonAccountService(PersonAccountRepo repository) {
        super(repository);
    }
}

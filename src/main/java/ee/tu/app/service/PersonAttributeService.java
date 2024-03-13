package ee.tu.app.service;


import ee.tu.app.domain.PersonAttribute;
import ee.tu.app.repo.PersonAttributeRepo;

public class PersonAttributeService extends BaseService<PersonAttribute, PersonAttributeRepo> {

    public PersonAttributeService(PersonAttributeRepo repository) {
        super(repository);
    }
}

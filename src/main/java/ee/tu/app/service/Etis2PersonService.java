package ee.tu.app.service;


import ee.tu.app.domain.Etis2Person;
import ee.tu.app.repo.Etis2PersonRepo;

public class Etis2PersonService extends BaseService<Etis2Person, Etis2PersonRepo> {


    public Etis2PersonService(Etis2PersonRepo repository) {
        super(repository);
    }
}

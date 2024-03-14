package ee.tu.app.service;


import ee.tu.app.domain.Etis2Person;
import ee.tu.app.repo.Etis2PersonRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Etis2PersonService extends BaseService<Etis2Person> {


    public Etis2PersonService(Etis2PersonRepo repository) {
        super(repository);
    }
}

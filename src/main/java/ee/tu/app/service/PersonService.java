package ee.tu.app.service;

import ee.tu.app.domain.Person;
import ee.tu.app.repo.IBaseRepo;
import ee.tu.app.repo.PersonRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService extends BaseService<Person> {


    public PersonService(PersonRepo repository) {
        super(repository);
    }
}
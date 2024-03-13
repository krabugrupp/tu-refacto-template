package ee.tu.app.service;

import ee.tu.app.domain.Person;
import ee.tu.app.repo.PersonRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService {

    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getAllPersons() {
        return (List<Person>) personRepo.findAll();
    }

    public Optional<Person> getPersonById(Long id) {
        return personRepo.findById(id);
    }

    public Person savePerson(Person person) {
        return personRepo.save(person);
    }

    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }

}
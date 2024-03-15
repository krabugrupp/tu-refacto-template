package ee.tu.app.service;

import ee.tu.app.api.model.XRUserAccountInfo;
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

    public XRUserAccountInfo getPersonByUuid(String uuid) {
       Optional<Person> person =  ((PersonRepo) repository).findPersonByUuid(uuid);
       if(person.isEmpty()) {
           throw new RuntimeException("Person with uuid: {" + uuid + "} is not found");
       }


        XRUserAccountInfo userAccountInfo = new XRUserAccountInfo();
       return  null;
    }
}
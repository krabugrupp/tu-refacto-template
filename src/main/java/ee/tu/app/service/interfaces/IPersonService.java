package ee.tu.app.service.interfaces;

import ee.tu.app.domain.Person;

public interface IPersonService {
     Person getPersonByUuid(String uuid);
}

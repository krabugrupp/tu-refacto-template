package ee.tu.app.repo;

import ee.tu.app.domain.PersonAccount;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonAccountRepo extends IBaseRepo<PersonAccount, Long> {

}

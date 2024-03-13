package ee.tu.app.repo;

import ee.tu.app.domain.NameChange;
import org.springframework.stereotype.Repository;

@Repository
public interface NameChangeRepo extends IBaseRepo<NameChange, Long> {

}

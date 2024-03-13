package ee.tu.app.repo;

import ee.tu.app.domain.DuplicatePersonsLog;
import org.springframework.stereotype.Repository;

@Repository
public interface DuplicatePersonsLogRepo extends IBaseRepo<DuplicatePersonsLog, Long> {

}

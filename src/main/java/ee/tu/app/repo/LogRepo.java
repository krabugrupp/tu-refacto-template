package ee.tu.app.repo;

import ee.tu.app.domain.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends IBaseRepo<Log, Long> {

}

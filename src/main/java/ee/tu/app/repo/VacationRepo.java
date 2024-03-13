package ee.tu.app.repo;

import ee.tu.app.domain.Vacation;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationRepo extends IBaseRepo<Vacation, Long> {

}

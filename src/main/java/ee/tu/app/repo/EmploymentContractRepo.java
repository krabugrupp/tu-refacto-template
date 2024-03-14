package ee.tu.app.repo;

import ee.tu.app.domain.EmploymentCategory;
import ee.tu.app.domain.EmploymentContract;
import org.springframework.stereotype.Repository;


@Repository
public interface EmploymentContractRepo extends IBaseRepo<EmploymentCategory, Long> {

}

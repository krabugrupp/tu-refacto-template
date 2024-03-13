package ee.tu.app.repo;

import ee.tu.app.domain.SalaryData;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryDataRepo extends IBaseRepo<SalaryData, Long> {

}

package ee.tu.app.repo;

import ee.tu.app.domain.EmploymentCategory;
import org.springframework.stereotype.Repository;


@Repository
public interface EmploymentCategoryRepo extends IBaseRepo<EmploymentCategory, Long> {

}

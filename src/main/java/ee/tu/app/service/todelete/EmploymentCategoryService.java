package ee.tu.app.service.todelete;


import ee.tu.app.domain.EmploymentCategory;
import ee.tu.app.repo.EmploymentCategoryRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmploymentCategoryService extends BaseService<EmploymentCategory> {

    public EmploymentCategoryService(EmploymentCategoryRepo repository) {
        super(repository);
    }
}

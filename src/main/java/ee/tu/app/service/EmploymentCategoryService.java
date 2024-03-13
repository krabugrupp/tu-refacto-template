package ee.tu.app.service;


import ee.tu.app.domain.EmploymentCategory;
import ee.tu.app.repo.EmploymentCategoryRepo;

public class EmploymentCategoryService extends BaseService<EmploymentCategory, EmploymentCategoryRepo> {

    public EmploymentCategoryService(EmploymentCategoryRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;


import ee.tu.app.domain.EmploymentCategory;
import ee.tu.app.repo.EmploymentContractRepo;

public class EmploymentContractService extends BaseService<EmploymentCategory, EmploymentContractRepo> {
    public EmploymentContractService(EmploymentContractRepo repository) {
        super(repository);
    }

}

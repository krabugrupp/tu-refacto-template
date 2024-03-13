package ee.tu.app.service;

import ee.tu.app.domain.EmploymentContractTermination;
import ee.tu.app.repo.EmploymentContractTerminationRepo;

public class EmploymentContractTerminationService extends BaseService<EmploymentContractTermination, EmploymentContractTerminationRepo> {

    public EmploymentContractTerminationService(EmploymentContractTerminationRepo repository) {
        super(repository);
    }
}

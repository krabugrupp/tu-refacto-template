package ee.tu.app.service;

import ee.tu.app.domain.EmploymentContractTermination;
import ee.tu.app.repo.EmploymentContractTerminationRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmploymentContractTerminationService extends BaseService<EmploymentContractTermination> {

    public EmploymentContractTerminationService(EmploymentContractTerminationRepo repository) {
        super(repository);
    }
}

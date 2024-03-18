package ee.tu.app.service.todelete;


import ee.tu.app.domain.EmploymentCategory;
import ee.tu.app.repo.EmploymentContractRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmploymentContractService extends BaseService<EmploymentCategory> {
    public EmploymentContractService(EmploymentContractRepo repository) {
        super(repository);
    }

}

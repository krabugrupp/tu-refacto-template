package ee.tu.app.service.todelete;

import ee.tu.app.domain.SalaryData;
import ee.tu.app.repo.SalaryDataRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SalaryDataService extends BaseService<SalaryData> {

    public SalaryDataService(SalaryDataRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service.todelete;

import ee.tu.app.domain.Vacation;
import ee.tu.app.repo.VacationRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VacationService extends BaseService<Vacation> {

    public VacationService(VacationRepo repository) {
        super(repository);
    }
}

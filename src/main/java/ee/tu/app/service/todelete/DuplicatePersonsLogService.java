package ee.tu.app.service.todelete;

import ee.tu.app.domain.DuplicatePersonsLog;
import ee.tu.app.repo.DuplicatePersonsLogRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DuplicatePersonsLogService extends BaseService<DuplicatePersonsLog> {

    public DuplicatePersonsLogService(DuplicatePersonsLogRepo repository) {
        super(repository);
    }
}

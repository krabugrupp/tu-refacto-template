package ee.tu.app.service;

import ee.tu.app.domain.Log;
import ee.tu.app.repo.LogRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LogService extends BaseService<Log> {

    public LogService(LogRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service.todelete;


import ee.tu.app.domain.JiraLog;
import ee.tu.app.repo.JiraLogRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class JiraLogService extends BaseService<JiraLog> {


    public JiraLogService(JiraLogRepo repository) {
        super(repository);
    }
}

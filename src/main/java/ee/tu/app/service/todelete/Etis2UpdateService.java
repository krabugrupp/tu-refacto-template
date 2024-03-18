package ee.tu.app.service.todelete;

import ee.tu.app.domain.Etis2Update;
import ee.tu.app.repo.Etis2UpdateRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Etis2UpdateService extends BaseService<Etis2Update> {

    public Etis2UpdateService(Etis2UpdateRepo repository) {
        super(repository);
    }
}

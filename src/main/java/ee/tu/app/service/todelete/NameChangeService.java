package ee.tu.app.service.todelete;

import ee.tu.app.domain.NameChange;
import ee.tu.app.repo.NameChangeRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NameChangeService extends BaseService<NameChange> {

    public NameChangeService(NameChangeRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service.todelete;

import ee.tu.app.domain.AClass;
import ee.tu.app.repo.AClassRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AClassService extends BaseService<AClass> {

    public AClassService(AClassRepo repository) {
        super(repository);
    }
}
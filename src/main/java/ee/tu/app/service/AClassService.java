package ee.tu.app.service;

import ee.tu.app.domain.AClass;
import ee.tu.app.repo.AClassRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AClassService extends BaseService<AClass, AClassRepo> {

    public AClassService(AClassRepo repository) {
        super(repository);
    }
}
package ee.tu.app.service.todelete;

import ee.tu.app.domain.AxaptaTransformation;
import ee.tu.app.repo.AxaptaTransformationRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AxaptaTransformationService extends BaseService<AxaptaTransformation>{

    public AxaptaTransformationService(AxaptaTransformationRepo repository) {
        super(repository);
    }
}

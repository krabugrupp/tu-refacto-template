package ee.tu.app.service.todelete;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ee.tu.app.domain.AxaptaError;
import ee.tu.app.repo.AxaptaErrorRepo;

@Service
@Transactional
public class AxaptaErrorService extends BaseService<AxaptaError> {

    public AxaptaErrorService(AxaptaErrorRepo repository) {
        super(repository);
    }
}

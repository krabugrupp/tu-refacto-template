package ee.tu.app.service;

import ee.tu.app.domain.InnerRangeAccess;
import ee.tu.app.repo.InnerRangeAccessRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InnerRangeAccessService extends BaseService<InnerRangeAccess> {


    public InnerRangeAccessService(InnerRangeAccessRepo repository) {
        super(repository);
    }
}

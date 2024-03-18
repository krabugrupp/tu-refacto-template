package ee.tu.app.service.todelete;


import ee.tu.app.domain.InnerRangeUser;
import ee.tu.app.repo.InnerRangeUserRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InnerRangeUserService extends BaseService<InnerRangeUser> {

    public InnerRangeUserService(InnerRangeUserRepo repository) {
        super(repository);
    }
}

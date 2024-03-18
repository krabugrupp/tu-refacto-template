package ee.tu.app.service.todelete;

import ee.tu.app.domain.Degree;
import ee.tu.app.repo.DegreeRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DegreeService extends BaseService<Degree> {

    public DegreeService(DegreeRepo repository) {
        super(repository);
    }
}

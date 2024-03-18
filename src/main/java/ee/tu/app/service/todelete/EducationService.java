package ee.tu.app.service.todelete;

import ee.tu.app.domain.Education;
import ee.tu.app.repo.EducationRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationService extends BaseService<Education> {

    public EducationService(EducationRepo repository) {
        super(repository);
    }
}

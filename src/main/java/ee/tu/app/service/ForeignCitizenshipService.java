package ee.tu.app.service;

import ee.tu.app.domain.ForeignCitizenship;
import ee.tu.app.repo.ForeignCitizenshipRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ForeignCitizenshipService extends BaseService<ForeignCitizenship> {

    public ForeignCitizenshipService(ForeignCitizenshipRepo repository) {
        super(repository);
    }
}

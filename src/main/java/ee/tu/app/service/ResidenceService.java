package ee.tu.app.service;


import ee.tu.app.domain.Residence;
import ee.tu.app.repo.ResidenceRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResidenceService extends BaseService<Residence> {

    public ResidenceService(ResidenceRepo repository) {
        super(repository);
    }
}

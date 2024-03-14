package ee.tu.app.service;


import ee.tu.app.domain.Institution;
import ee.tu.app.repo.InstitutionRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InstitutionService extends BaseService<Institution> {


    public InstitutionService(InstitutionRepo repository) {
        super(repository);
    }
}

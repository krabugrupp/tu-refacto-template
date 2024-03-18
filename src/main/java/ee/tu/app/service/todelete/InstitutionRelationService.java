package ee.tu.app.service.todelete;

import ee.tu.app.domain.InstitutionRelation;
import ee.tu.app.repo.InstitutionRelationRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InstitutionRelationService extends BaseService<InstitutionRelation> {


    public InstitutionRelationService(InstitutionRelationRepo repository) {
        super(repository);
    }
}

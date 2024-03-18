package ee.tu.app.service.todelete;

import ee.tu.app.domain.Structure;
import ee.tu.app.repo.StructureRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StructureService extends BaseService<Structure> {

    public StructureService(StructureRepo repository) {
        super(repository);
    }
}

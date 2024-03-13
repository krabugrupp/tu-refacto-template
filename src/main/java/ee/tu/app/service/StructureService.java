package ee.tu.app.service;

import ee.tu.app.domain.Structure;
import ee.tu.app.repo.StructureRepo;

public class StructureService extends BaseService<Structure, StructureRepo> {

    public StructureService(StructureRepo repository) {
        super(repository);
    }
}

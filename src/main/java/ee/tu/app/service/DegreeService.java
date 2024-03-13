package ee.tu.app.service;

import ee.tu.app.domain.Degree;
import ee.tu.app.repo.DegreeRepo;

public class DegreeService extends BaseService<Degree, DegreeRepo> {

    public DegreeService(DegreeRepo repository) {
        super(repository);
    }
}

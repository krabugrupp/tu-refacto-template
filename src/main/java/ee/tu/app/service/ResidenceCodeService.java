package ee.tu.app.service;

import ee.tu.app.domain.ResidenceCode;
import ee.tu.app.repo.ResidenceCodeRepo;

public class ResidenceCodeService extends BaseService<ResidenceCode, ResidenceCodeRepo> {

    public ResidenceCodeService(ResidenceCodeRepo repository) {
        super(repository);
    }
}

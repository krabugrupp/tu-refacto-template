package ee.tu.app.service;

import ee.tu.app.domain.InnerRangeAccess;
import ee.tu.app.repo.InnerRangeAccessRepo;

public class InnerRangeAccessService extends BaseService<InnerRangeAccess, InnerRangeAccessRepo> {


    public InnerRangeAccessService(InnerRangeAccessRepo repository) {
        super(repository);
    }
}

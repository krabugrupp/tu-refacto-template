package ee.tu.app.service;

import ee.tu.app.domain.InnerRangeUser;
import ee.tu.app.repo.InnerRangeUserRepo;

public class InnerRangeCardService extends BaseService<InnerRangeUser> {

    public InnerRangeCardService(InnerRangeUserRepo repository) {
        super(repository);
    }
}

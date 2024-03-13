package ee.tu.app.service;


import ee.tu.app.domain.InnerRangeUser;
import ee.tu.app.repo.InnerRangeUserRepo;

public class InnerRangeUserService extends BaseService<InnerRangeUser, InnerRangeUserRepo> {

    public InnerRangeUserService(InnerRangeUserRepo repository) {
        super(repository);
    }
}

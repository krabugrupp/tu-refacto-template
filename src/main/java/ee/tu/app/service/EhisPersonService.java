package ee.tu.app.service;


import ee.tu.app.domain.EhisPerson;
import ee.tu.app.repo.EhisPersonRepo;

public class EhisPersonService extends BaseService<EhisPerson, EhisPersonRepo> {

    public EhisPersonService(EhisPersonRepo repository) {
        super(repository);
    }
}

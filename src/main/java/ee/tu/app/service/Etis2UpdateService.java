package ee.tu.app.service;

import ee.tu.app.domain.Etis2Update;
import ee.tu.app.repo.Etis2UpdateRepo;

public class Etis2UpdateService extends BaseService<Etis2Update, Etis2UpdateRepo> {

    public Etis2UpdateService(Etis2UpdateRepo repository) {
        super(repository);
    }
}

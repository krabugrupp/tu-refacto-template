package ee.tu.app.service;

import ee.tu.app.domain.NameChange;
import ee.tu.app.repo.NameChangeRepo;

public class NameChangeService extends BaseService<NameChange, NameChangeRepo> {

    public NameChangeService(NameChangeRepo repository) {
        super(repository);
    }
}

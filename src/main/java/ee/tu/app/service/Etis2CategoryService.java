package ee.tu.app.service;

import ee.tu.app.domain.Etis2Category;
import ee.tu.app.repo.Etis2CategoryRepo;

public class Etis2CategoryService extends BaseService<Etis2Category, Etis2CategoryRepo> {

    public Etis2CategoryService(Etis2CategoryRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;

import ee.tu.app.domain.HelpDate;
import ee.tu.app.repo.HelpDateRepo;

public class HelpDateService extends BaseService<HelpDate, HelpDateRepo> {


    public HelpDateService(HelpDateRepo repository) {
        super(repository);
    }
}

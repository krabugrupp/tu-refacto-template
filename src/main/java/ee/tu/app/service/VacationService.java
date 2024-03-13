package ee.tu.app.service;

import ee.tu.app.domain.Vacation;
import ee.tu.app.repo.VacationRepo;

public class VacationService extends BaseService<Vacation, VacationRepo> {

    public VacationService(VacationRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;

import ee.tu.app.domain.DuplicatePersonsLog;
import ee.tu.app.repo.DuplicatePersonsLogRepo;

public class DuplicatePersonsLogService extends BaseService<DuplicatePersonsLog, DuplicatePersonsLogRepo> {

    public DuplicatePersonsLogService(DuplicatePersonsLogRepo repository) {
        super(repository);
    }
}

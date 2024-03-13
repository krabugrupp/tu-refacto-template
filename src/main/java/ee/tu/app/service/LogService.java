package ee.tu.app.service;

import ee.tu.app.domain.Log;
import ee.tu.app.repo.LogRepo;

public class LogService extends BaseService<Log, LogRepo> {

    public LogService(LogRepo repository) {
        super(repository);
    }
}

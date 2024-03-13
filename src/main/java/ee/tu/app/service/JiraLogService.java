package ee.tu.app.service;


import ee.tu.app.domain.JiraLog;
import ee.tu.app.repo.JiraLogRepo;

public class JiraLogService extends BaseService<JiraLog, JiraLogRepo> {


    public JiraLogService(JiraLogRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;

import ee.tu.app.domain.SalaryData;
import ee.tu.app.repo.SalaryDataRepo;

public class SalaryDataService extends BaseService<SalaryData, SalaryDataRepo> {

    public SalaryDataService(SalaryDataRepo repository) {
        super(repository);
    }
}

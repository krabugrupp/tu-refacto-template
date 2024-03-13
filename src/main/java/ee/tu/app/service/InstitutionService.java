package ee.tu.app.service;


import ee.tu.app.domain.Institution;
import ee.tu.app.repo.InstitutionRepo;

public class InstitutionService extends BaseService<Institution, InstitutionRepo> {


    public InstitutionService(InstitutionRepo repository) {
        super(repository);
    }
}

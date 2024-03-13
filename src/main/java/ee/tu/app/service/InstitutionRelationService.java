package ee.tu.app.service;

import ee.tu.app.domain.InstitutionRelation;
import ee.tu.app.repo.InstitutionRelationRepo;


public class InstitutionRelationService extends BaseService<InstitutionRelation, InstitutionRelationRepo> {


    public InstitutionRelationService(InstitutionRelationRepo repository) {
        super(repository);
    }
}

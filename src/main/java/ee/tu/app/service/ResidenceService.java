package ee.tu.app.service;


import ee.tu.app.domain.Residence;
import ee.tu.app.repo.ResidenceRepo;

public class ResidenceService extends BaseService<Residence, ResidenceRepo> {

    public ResidenceService(ResidenceRepo repository) {
        super(repository);
    }
}

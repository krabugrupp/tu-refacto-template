package ee.tu.app.service;

import ee.tu.app.domain.ForeignCitizenship;
import ee.tu.app.repo.ForeignCitizenshipRepo;

public class ForeignCitizenshipService extends BaseService<ForeignCitizenship, ForeignCitizenshipRepo> {


    public ForeignCitizenshipService(ForeignCitizenshipRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;

import ee.tu.app.domain.Education;
import ee.tu.app.repo.EducationRepo;


public class EducationService extends BaseService<Education, EducationRepo> {

    public EducationService(EducationRepo repository) {
        super(repository);
    }
}

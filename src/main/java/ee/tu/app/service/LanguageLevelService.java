package ee.tu.app.service;


import ee.tu.app.domain.LanguageLevel;
import ee.tu.app.repo.LanguageLevelRepo;

public class LanguageLevelService extends BaseService<LanguageLevel, LanguageLevelRepo> {

    public LanguageLevelService(LanguageLevelRepo repository) {
        super(repository);
    }
}

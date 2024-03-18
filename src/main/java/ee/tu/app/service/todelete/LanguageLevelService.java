package ee.tu.app.service.todelete;


import ee.tu.app.domain.LanguageLevel;
import ee.tu.app.repo.LanguageLevelRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LanguageLevelService extends BaseService<LanguageLevel> {

    public LanguageLevelService(LanguageLevelRepo repository) {
        super(repository);
    }
}

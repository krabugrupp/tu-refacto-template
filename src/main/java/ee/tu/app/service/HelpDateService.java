package ee.tu.app.service;

import ee.tu.app.domain.HelpDate;
import ee.tu.app.repo.HelpDateRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HelpDateService extends BaseService<HelpDate> {

    public HelpDateService(HelpDateRepo repository) {
        super(repository);
    }
}

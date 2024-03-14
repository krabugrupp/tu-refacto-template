package ee.tu.app.service;

import ee.tu.app.domain.Etis2Category;
import ee.tu.app.repo.Etis2CategoryRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Etis2CategoryService extends BaseService<Etis2Category> {

    public Etis2CategoryService(Etis2CategoryRepo repository) {
        super(repository);
    }
}

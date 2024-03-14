package ee.tu.app.service;


import ee.tu.app.domain.EhisPerson;
import ee.tu.app.repo.EhisPersonRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EhisPersonService extends BaseService<EhisPerson> {

    public EhisPersonService(EhisPersonRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;

import ee.tu.app.domain.ResidenceCode;
import ee.tu.app.repo.ResidenceCodeRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResidenceCodeService extends BaseService<ResidenceCode> {

    public ResidenceCodeService(ResidenceCodeRepo repository) {
        super(repository);
    }
}

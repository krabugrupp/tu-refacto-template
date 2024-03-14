package ee.tu.app.service;

import ee.tu.app.domain.Nickname;
import ee.tu.app.repo.NicknameRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NicknameService extends BaseService<Nickname> {
    public NicknameService(NicknameRepo repository) {
        super(repository);
    }
}

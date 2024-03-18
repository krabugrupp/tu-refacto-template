package ee.tu.app.service.todelete;


import ee.tu.app.domain.UserCredentials;
import ee.tu.app.repo.UserCredentialsRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserCredentialsService extends BaseService<UserCredentials> {

    public UserCredentialsService(UserCredentialsRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;


import ee.tu.app.domain.UserCredentials;
import ee.tu.app.repo.UserCredentialsRepo;

public class UserCredentialsService extends BaseService<UserCredentials, UserCredentialsRepo> {

    public UserCredentialsService(UserCredentialsRepo repository) {
        super(repository);
    }
}

package ee.tu.app.repo;


import ee.tu.app.domain.UserCredentials;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialsRepo extends IBaseRepo<UserCredentials, Long> {

}

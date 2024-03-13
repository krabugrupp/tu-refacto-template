package ee.tu.app.repo;

import ee.tu.app.domain.Nickname;
import org.springframework.stereotype.Repository;


@Repository
public interface NicknameRepo extends IBaseRepo<Nickname, Long> {
}

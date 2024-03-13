package ee.tu.app.repo;

import ee.tu.app.domain.InnerRangeUser;
import org.springframework.stereotype.Repository;

@Repository
public interface InnerRangeCardRepo extends IBaseRepo<InnerRangeUser, Long> {

}

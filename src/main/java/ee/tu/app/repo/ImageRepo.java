package ee.tu.app.repo;
import ee.tu.app.domain.Image;
import org.springframework.stereotype.Repository;


@Repository
public interface ImageRepo extends IBaseRepo<Image, Long> {

}

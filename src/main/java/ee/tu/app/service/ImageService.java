package ee.tu.app.service;
import ee.tu.app.domain.Image;
import ee.tu.app.repo.ImageRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImageService extends BaseService<Image> {

    public ImageService(ImageRepo repository) {
        super(repository);
    }
}

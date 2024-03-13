package ee.tu.app.service;
import ee.tu.app.domain.Image;
import ee.tu.app.repo.ImageRepo;


public class ImageService extends BaseService<Image, ImageRepo> {

    public ImageService(ImageRepo repository) {
        super(repository);
    }
}

package ee.tu.app.service;

import ee.tu.app.domain.Nickname;
import ee.tu.app.repo.NicknameRepo;


public class NicknameService extends BaseService<Nickname, NicknameRepo> {
    public NicknameService(NicknameRepo repository) {
        super(repository);
    }
}

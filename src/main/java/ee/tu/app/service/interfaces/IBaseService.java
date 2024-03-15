package ee.tu.app.service.interfaces;

import ee.tu.app.repo.IBaseRepo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface IBaseService <TClass>  {

    public List<TClass> getAll();

    public Optional<TClass> get(Long id);

    public TClass update(TClass updated);

    public TClass create(TClass newDomain);

    public void delete(Long id);
}

package ee.tu.app.service.todelete;

import ee.tu.app.repo.IBaseRepo;
import ee.tu.app.service.interfaces.IBaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


public abstract class BaseService<TClass> implements IBaseService<TClass> {

    public final IBaseRepo<TClass, Long> repository;

    public BaseService(IBaseRepo<TClass, Long> repository) {
        this.repository = repository;
    }

    public List<TClass> getAll(){
        return (List<TClass>) repository.findAll();
    }

    public Optional<TClass> get(Long id){
        return (Optional<TClass>) repository.findById(id);
    }

    @Transactional
    public TClass update(TClass updated){
        return (TClass) repository.save(updated);
    }

    @Transactional
    public TClass create(TClass newDomain){
        return repository.save(newDomain);
    }

    @Transactional
    public void delete(Long id){
        get(id);
        repository.deleteById(id);
    }
}
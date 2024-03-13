package ee.tu.app.service;

import ee.tu.app.repo.IBaseRepo;
import ee.tu.app.service.interfaces.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public abstract class BaseService <TClass, TKey> implements IBaseService<TClass> {

    private final IBaseRepo<TClass, Long> repository;



    @Autowired
    public BaseService(IBaseRepo repository) {
        this.repository = repository;
    }

    public List<TClass> getAll() {
        return (List<TClass>) repository.findAll();
    }

    public Optional<TClass> getAxaptaErrorById(Long id) {
        return repository.findById(id);
    }

    public TClass saveAxaptaError(TClass entity) {
        return (TClass) repository.save(entity);
    }

    public void deleteAxaptaError(Long id) {
        repository.deleteById(id);
    }


}
package ee.tu.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@NoRepositoryBean
public interface IBaseRepo<TClass, TKey> extends CrudRepository<TClass, TKey> {

}
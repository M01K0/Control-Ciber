package sv.com.ciber.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.ciber.main.model.Departamentos;

@Repository
public interface IDepartamentosRepository extends CrudRepository<Departamentos, Integer> {

}

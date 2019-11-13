package sv.com.ciber.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.ciber.main.model.Sedes;

@Repository
public interface ISedesRepository extends CrudRepository<Sedes, Integer> {

}

package sv.com.ciber.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.ciber.main.model.Equipos;

@Repository
public interface IEquiposRepository extends CrudRepository<Equipos, Integer> {

}

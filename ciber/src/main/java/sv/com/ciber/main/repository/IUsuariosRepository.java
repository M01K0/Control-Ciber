package sv.com.ciber.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.ciber.main.model.Usuarios;

@Repository
public interface IUsuariosRepository extends CrudRepository<Usuarios, Integer> {

}

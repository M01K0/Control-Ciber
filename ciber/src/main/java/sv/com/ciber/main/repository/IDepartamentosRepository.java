	//Autor: William Valdez
	//Fecha: 12/11/2019
	//Descripción: Repositorio Departamentos

package sv.com.ciber.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.ciber.main.model.Departamentos;

@Repository
public interface IDepartamentosRepository extends CrudRepository<Departamentos, Integer> {

}

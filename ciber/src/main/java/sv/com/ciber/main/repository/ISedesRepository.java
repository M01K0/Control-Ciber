	//Autor: William Valdez
	//Fecha: 12/11/2019
	//Descripción: Repositorio Sedes

package sv.com.ciber.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sv.com.ciber.main.model.Sedes;

@Repository
public interface ISedesRepository extends CrudRepository<Sedes, Integer> {

}

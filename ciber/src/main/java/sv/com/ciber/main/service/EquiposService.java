	//Autor: Kenia Rosales
	//Fecha: 14/11/2019
	//Descripción: Equipo Service
package sv.com.ciber.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.ciber.main.model.Equipos;
import sv.com.ciber.main.model.Sedes;
import sv.com.ciber.main.repository.IEquiposRepository;
import sv.com.ciber.main.repository.ISedesRepository;

@Service
@Transactional
public class EquiposService {

	@Autowired
	IEquiposRepository rEquipos;
	
	@Autowired
	ISedesRepository rSedes;
	
	//Lista Equipos
	public List<Equipos> findAll(){
		List<Equipos> lista = (List<Equipos>) rEquipos.findAll();
		return lista;
	}
	
	//Equipos por ID
	public Equipos findById(Integer id) {
		return rEquipos.findById(id).get();
	}
	
	//Guardar Equipos 
	public void save (Equipos equipo) {
		rEquipos.save(equipo);
	}
	
	//Eliminar Equipos
	public void deleteById(Integer id) {
		rEquipos.deleteById(id);
	}
	
	//Lista Sedes
	public List<Sedes> findAllSedes(){
		List<Sedes> lista = (List<Sedes>) rSedes.findAll();
		return lista;
	}
	
	//Sedes por ID
	public Sedes findBySede(Integer id) {
		return rSedes.findById(id).get();
	}
	
}

	//Autor: Kenia Rosales
	//Fecha: 14/11/2019
	//Descripción: Sedes Service

package sv.com.ciber.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.ciber.main.model.Municipios;
import sv.com.ciber.main.model.Sedes;
import sv.com.ciber.main.repository.IMunicipiosRepository;
import sv.com.ciber.main.repository.ISedesRepository;

@Service
@Transactional
public class SedesService {
	
	@Autowired
	ISedesRepository rSedes;
	
	@Autowired
	IMunicipiosRepository rMuni;
	
	//Lista Sedes
	public List<Sedes> findAll(){
		List<Sedes> lista = (List<Sedes>) rSedes.findAll();
		return lista;
	}
	
	//Buscar Sede por ID
	public Sedes findSedesById(Integer id) {
		return rSedes.findById(id).get();
	}
	
	//Eliminar por ID
	public void deleteById(Integer id) {
		rSedes.deleteById(id);
	}
	
	//Guardar Sedes
	public void save(Sedes sedes) {
		rSedes.save(sedes);
	}
	
	//Lista Municipios
	public List<Municipios> listaMuni(){
		 List<Municipios> lista = (List<Municipios>) rMuni.findAll();
		 return lista;
	}
	
	//Obtener Municipios por ID
	public Municipios getMuniById(Integer id) {
		return rMuni.findById(id).get();
	}
}

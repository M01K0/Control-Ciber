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
public class SedeService {
	
	@Autowired
	ISedesRepository rSedes;
	
	@Autowired
	IMunicipiosRepository rMuni;
	
	public List<Sedes> lista(){
		return (List<Sedes>) rSedes.findAll();
	}
	
	public void eliminar(Integer id) {
		rSedes.deleteById(id);
	}
	
	public Sedes getSedesById(Integer id) {
		return rSedes.findById(id).get();
	}
	
	public void guardar(Sedes sedes) {
		rSedes.save(sedes);
	}
	
	public List<Municipios> listaMuni(){
		return (List<Municipios>) rMuni.findAll();
	}
	
	public Municipios getMuiById(Integer id) {
		return rMuni.findById(id).get();
	}
}

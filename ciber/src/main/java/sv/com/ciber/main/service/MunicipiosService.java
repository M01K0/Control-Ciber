	//Autor: Kenia Rosales
	//Fecha: 14/11/2019
	//Descripción: Municipios Service

package sv.com.ciber.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.ciber.main.model.Departamentos;
import sv.com.ciber.main.model.Municipios;
import sv.com.ciber.main.repository.IDepartamentosRepository;
import sv.com.ciber.main.repository.IMunicipiosRepository;

@Service
@Transactional
public class MunicipiosService {
	
	@Autowired
	IMunicipiosRepository rMuni;
	
	@Autowired
	IDepartamentosRepository rDep;
	
	public List<Municipios> lista(){
		return (List<Municipios>) rMuni.findAll();
	}
	
	public void eliminar(Integer id) {
		rMuni.deleteById(id);
	}
	
	public Municipios getMunicipiosById(Integer id) {
		return rMuni.findById(id).get();
	}
	
	public void guardarMunicipio(Municipios mun) {
		rMuni.save(mun);
	}
	
	public List<Departamentos> listaDep(){
		return (List<Departamentos>) rDep.findAll();
	}
	
	public Departamentos getDepById(Integer id) {
		return rDep.findById(id).get();
	}
	
	
}

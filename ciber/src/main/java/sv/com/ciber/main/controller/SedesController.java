	//Autor: Kenia Rosales
	//Fecha: 17/11/2019
	//Descripción: Sedes Controlador

package sv.com.ciber.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ciber.main.model.Municipios;
import sv.com.ciber.main.model.Sedes;
import sv.com.ciber.main.service.SedesService;

@RestController
@RequestMapping(value = "sedes")
public class SedesController {
	
	@Autowired
	SedesService sSedes;
	
	@GetMapping
	public List<Sedes> lista(){
		return (List<Sedes>) sSedes.findAll();
	}
	
	@GetMapping("/{id}")
	public Sedes getSedes(@PathVariable Integer id) {
		return sSedes.findSedesById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		 sSedes.deleteById(id);
	}
	
	@PostMapping
	public void save(@RequestBody Sedes sedes) {
		sSedes.save(sedes);
	}
	
	@PutMapping
	public void update(@RequestBody Sedes sedes) {
		sSedes.save(sedes);
	}

	
	//Métodos para Municipios
	@GetMapping("/municipios")
	public List<Municipios> listaMunicipios(){
		return (List<Municipios>) sSedes.listaMuni();
	}
	
	@GetMapping("/municipios/{id}")
	public Municipios getMunicipios(@PathVariable Integer id) {
		return sSedes.getMuniById(id);
	}
}

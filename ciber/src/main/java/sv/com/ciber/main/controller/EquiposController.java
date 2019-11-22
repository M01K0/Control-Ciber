	//Autor: Kenia Rosales
	//Fecha: 17/11/2019
	//Descripción: Equipo Controlador
package sv.com.ciber.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ciber.main.model.Equipos;
import sv.com.ciber.main.model.Sedes;
import sv.com.ciber.main.service.EquiposService;

@RestController
@RequestMapping(value = "equipos")
public class EquiposController {

	@Autowired
	EquiposService sEquipos;
	
	@GetMapping
	public List<Equipos> lista(){
		return (List<Equipos>) sEquipos.findAll();
	}
	
	@GetMapping("/{id}")
	public Equipos equiposId(@PathVariable Integer id) {
		return sEquipos.findById(id);
	}
	
	@PostMapping
	public void save(Equipos equipo) {
		sEquipos.save(equipo);
	}

	@PutMapping
	public void update(Equipos equipo) {
		sEquipos.save(equipo);
	}
	
	//Métodos para Sede
	@GetMapping("/sedes")
	public List<Sedes> listaSedes(){
		return (List<Sedes>) sEquipos.findAllSedes();
	}
	
	@GetMapping("/sedes/{id}")
	public Sedes sedesById(@PathVariable Integer id) {
		return sEquipos.findBySede(id);
	}
}

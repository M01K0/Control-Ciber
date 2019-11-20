package sv.com.ciber.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.ciber.main.model.Equipos;
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
}

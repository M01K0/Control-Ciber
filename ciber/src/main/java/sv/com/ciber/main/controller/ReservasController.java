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

import sv.com.ciber.main.model.Reservas;
import sv.com.ciber.main.service.ReservasService;

@RestController
@RequestMapping(value = "reservas")
public class ReservasController {
	
	@Autowired
	ReservasService sReservas;
	
	@GetMapping
	public List<Reservas> lista(){
		return (List<Reservas>) sReservas.findAll();
	}
	
	@GetMapping("/{id}")
	public Reservas reservasId(@PathVariable Integer id) {
		return sReservas.findById(id);
	}
	
	@PostMapping
	public void save(@RequestBody Reservas reservas) {
		sReservas.save(reservas);
	}
	
	@PutMapping
	public void update(@RequestBody Reservas reservas) {
		sReservas.save(reservas);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		sReservas.deleteById(id);
	}

	//Métodos para usuario
	
}

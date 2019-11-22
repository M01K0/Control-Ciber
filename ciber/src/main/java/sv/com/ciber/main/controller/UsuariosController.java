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

import sv.com.ciber.main.model.Usuarios;
import sv.com.ciber.main.service.UsuariosService;

@RestController
@RequestMapping(value = "usuarios")
public class UsuariosController {

	@Autowired
	UsuariosService us;
	
	//listar usuarios
	@GetMapping
	public List<Usuarios> lista(){
		List<Usuarios> lista = us.listarTodo();
		return lista;
	}
	
	//buscar por ID
	@GetMapping("/{id}")
	public Usuarios getUsuarios(@PathVariable Integer id) {
		return us.getUsuariosById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		 us.eliminar(id);
	}
	
	@PostMapping
	public void save(@RequestBody Usuarios usuario) {
		us.guardar(usuario);
	}
	
	@PutMapping
	public void update(@RequestBody Usuarios usuario) {
		us.guardar(usuario);
	}
}

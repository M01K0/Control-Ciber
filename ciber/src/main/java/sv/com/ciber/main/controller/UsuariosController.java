 package sv.com.ciber.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}

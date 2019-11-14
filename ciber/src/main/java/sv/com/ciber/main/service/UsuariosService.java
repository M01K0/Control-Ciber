package sv.com.ciber.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.ciber.main.model.Usuarios;
import sv.com.ciber.main.repository.IUsuariosRepository;

@Service
@Transactional
public class UsuariosService {

	@Autowired
	IUsuariosRepository rUser;
	
	public List<Usuarios> listarTodo(){
		return (List<Usuarios>) rUser.findAll();
	}
	
	public void eliminar(Integer id) {
		rUser.deleteById(id);
	}
	
	public Usuarios getUsuariosById(Integer id) {
		return rUser.findById(id).get();
	}
	
	public void guardar(Usuarios usuarios) {
		rUser.save(usuarios);
	}
}

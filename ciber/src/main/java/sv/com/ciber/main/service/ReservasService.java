package sv.com.ciber.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.ciber.main.model.Equipos;
import sv.com.ciber.main.model.Reservas;
import sv.com.ciber.main.model.Usuarios;
import sv.com.ciber.main.repository.IEquiposRepository;
import sv.com.ciber.main.repository.IReservasRepository;
import sv.com.ciber.main.repository.IUsuariosRepository;

@Service
@Transactional
public class ReservasService {

	@Autowired
	IReservasRepository rReservas;
	
	@Autowired 
	IEquiposRepository rEquipos;
	
	@Autowired
	IUsuariosRepository rUsuarios;
	
	//Lista Reservas
	public List<Reservas> findAll(){
		List<Reservas> lista = (List<Reservas>) rReservas.findAll();
		return lista;
	}
	
	//Reservas por ID
	public Reservas findById(Integer id) {
		return rReservas.findById(id).get();
	}
	
	//Guardar Reservas
	public void save(Reservas reserva) {
		rReservas.save(reserva);
	}
	
	//Eliminar Reservas 
	public void deleteById(Integer id) {
		rReservas.deleteById(id);
	}
	
	//Listar Usuarios
	public List<Usuarios> findAllUsuarios(){
		List<Usuarios> lista = (List<Usuarios>) rUsuarios.findAll();
		return lista;
	}
	
	//Usuarios por ID
	public Usuarios findByIdUsuarios(Integer id) {
		return rUsuarios.findById(id).get();
	}
	
	//Lista Equipos 
	public List<Equipos> findAllEquipo(){
		List<Equipos> lista = (List<Equipos>) rEquipos.findAll();
		return lista;
	}
	
	//Equipos por ID
	public Equipos findByEquipos(Integer id) {
		return rEquipos.findById(id).get();
	}
	
}

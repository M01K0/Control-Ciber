package sv.com.ciber.main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sv.com.ciber.main.model.Municipios;

@Entity
@Table(name = "sede")
public class Sedes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String direccion;
	private String encargado;
	private Integer telefono;
	private Integer cant_equipo;
	
	@JoinColumn(name = "id_muni")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Municipios id_muni;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getCant_equipo() {
		return cant_equipo;
	}

	public void setCant_equipo(Integer cant_equipo) {
		this.cant_equipo = cant_equipo;
	}

	public Municipios getId_muni() {
		return id_muni;
	}

	public void setId_muni(Municipios id_muni) {
		this.id_muni = id_muni;
	}
	
}

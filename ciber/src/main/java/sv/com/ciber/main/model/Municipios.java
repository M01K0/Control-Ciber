	//Autor: William Valdez
	//Fecha: 12/11/2019
	//Descripción: Entidad Municipios

package sv.com.ciber.main.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sv.com.ciber.main.model.Departamentos;

@Entity
@Table(name = "municipios")
public class Municipios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	
	@JoinColumn(name = "id_dep")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Departamentos id_dep;

	//Getter and Setter
	
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

	public Departamentos getId_dep() {
		return id_dep;
	}

	public void setId_dep(Departamentos id_dep) {
		this.id_dep = id_dep;
	}
}

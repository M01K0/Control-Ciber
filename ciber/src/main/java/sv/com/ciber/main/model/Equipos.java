	//Autor: William Valdez
	//Fecha: 12/11/2019
	//Descripción: Entidad Equipos

package sv.com.ciber.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String num_maquina;
	private String marca;
	private String color;
	private Date fecha_comEq;
	private String estado;
	
	@JoinColumn(name = "id_sede")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Sedes id_sede;

	//Getter and Setter
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNum_maquina() {
		return num_maquina;
	}

	public void setNum_maquina(String num_maquina) {
		this.num_maquina = num_maquina;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getFecha_comEq() {
		return fecha_comEq;
	}

	public void setFecha_comEq(Date fecha_comEq) {
		this.fecha_comEq = fecha_comEq;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Sedes getId_sede() {
		return id_sede;
	}

	public void setId_sede(Sedes id_sede) {
		this.id_sede = id_sede;
	}
	
}

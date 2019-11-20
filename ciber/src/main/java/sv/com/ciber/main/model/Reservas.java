	//Autor: William Valdez
	//Fecha: 12/11/2019
	//Descripción: Entidad Reservas

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
@Table(name = "reservas")
public class Reservas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fecha_reserva;
	private Date hora_fin;
	
	@JoinColumn(name = "id_usuario")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Usuarios id_usuario;
	
	@JoinColumn(name = "id_equipo")
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Equipos id_equipo;

	//Getter and Setter
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(Date fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public Date getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(Date hora_fin) {
		this.hora_fin = hora_fin;
	}

	public Usuarios getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuarios id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Equipos getId_equipo() {
		return id_equipo;
	}

	public void setId_equipo(Equipos id_equipo) {
		this.id_equipo = id_equipo;
	}
	
}

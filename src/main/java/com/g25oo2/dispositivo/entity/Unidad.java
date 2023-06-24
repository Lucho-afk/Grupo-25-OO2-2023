package com.g25oo2.dispositivo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unidad")
public class Unidad {

	@Id
	@Column(name = "ID_UNIDAD")
	private String idUnidad;

	@Column(name = "ESTADO")
	private int estado;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DISPOSITIVO", referencedColumnName = "ID_DISPOSITIVO", columnDefinition = "int")
	private Dispositivo dispositivo;

	@OneToMany(mappedBy = "unidad", cascade = CascadeType.ALL)
	private List<Evento> eventos;

	public String getId() {
		return idUnidad;
	}
	
	
// quitar este comentario mata la lista de unidades en el front
//	public List<Evento> getEventos() {
//		return eventos;
//	}
//
//
//
//	public void setEventos(List<Evento> eventos) {
//		this.eventos = eventos;
//	}



	public void setId(String id) {
		this.idUnidad = id;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public String toString() {
		return "Unidad [idUnidad=" + idUnidad + ", estado=" + estado + ", dispositivo=" + dispositivo + ", eventos="
				+ eventos + "]";
	}
	
	

}

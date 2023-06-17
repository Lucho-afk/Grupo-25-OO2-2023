package com.g25oo2.dispositivo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="unidad")
public class Unidad {
	
	@Id
	@Column(name="ID_UNIDAD")
	private String idUnidad;
	
	@Column(name="ESTADO")
	private int estado;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "DISPOSITIVO", referencedColumnName = "ID_DISPOSITIVO", columnDefinition = "int")
	private Dispositivo dispositivo;
	
	@OneToMany(mappedBy ="unidad", cascade = CascadeType.ALL)
	private List<Evento> eventos;

	public String getId() {
		return idUnidad;
	}

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
	
}

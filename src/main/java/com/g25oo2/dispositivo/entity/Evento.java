package com.g25oo2.dispositivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="evento")
public class Evento {

	
	@Id
	@Column(name="ID_EVENTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	
	@Column(name="FECHA_HORA")
	private LocalDateTime fechaHora;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="ESTADO")
	private int estado;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "UNIDAD", referencedColumnName = "ID_UNIDAD")
	private Unidad unidad;

	public int getId() {
		return idEvento;
	}

	public void setId(int id) {
		this.idEvento = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	
	
}

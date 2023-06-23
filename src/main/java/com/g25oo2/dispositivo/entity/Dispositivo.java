package com.g25oo2.dispositivo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "dispositivo")
public class Dispositivo {

	@Id
	@Column(name = "ID_DISPOSITIVO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDispositivo;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "ESTADO")
	private int estado;

	@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
	private List<Unidad> unidades;

	public int getId() {
		return idDispositivo;
	}

	public void setId(int id) {
		this.idDispositivo = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}

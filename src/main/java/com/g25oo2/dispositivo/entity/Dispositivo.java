package com.g25oo2.dispositivo.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="dispositivo")
public class Dispositivo {

	
	@Id
	@Column(name="ID_DISPOSITIVO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDispositivo;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="ESTADO")
	private int estado;

	@OneToMany(mappedBy ="dispositivo", cascade = CascadeType.ALL)
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

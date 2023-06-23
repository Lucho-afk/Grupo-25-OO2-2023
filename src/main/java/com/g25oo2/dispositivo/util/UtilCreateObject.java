package com.g25oo2.dispositivo.util;

public class UtilCreateObject {

	private int idDispositivo;
	private String nombreUnidad;

	public UtilCreateObject(int idDispositivo, String nombreUnidad) {
		super();
		this.idDispositivo = idDispositivo;
		this.nombreUnidad = nombreUnidad;
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

}

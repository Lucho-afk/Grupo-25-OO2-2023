package com.g25oo2.dispositivo.service;

import java.util.List;

import com.g25oo2.dispositivo.entity.Unidad;

public interface UnidadService {
	
	public List<Unidad> traer();
	
	public void guardar(Unidad unidad);
	
	public void eliminar(Unidad unidad);
	
	

}

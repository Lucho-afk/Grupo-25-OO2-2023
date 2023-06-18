package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.repository.UnidadDao;
import com.g25oo2.dispositivo.service.UnidadService;

public class UnidadImpl implements UnidadService {
	@Autowired
	UnidadDao daoUnidad;
	
	public List<Unidad> traer(){
		return daoUnidad.findAll();
	}

	@Override
	public void guardar(Unidad unidad) {
		daoUnidad.save(unidad);
		
	}

	@Override
	public void eliminar(Unidad unidad) {
		daoUnidad.delete(unidad);
		
	}

	
}

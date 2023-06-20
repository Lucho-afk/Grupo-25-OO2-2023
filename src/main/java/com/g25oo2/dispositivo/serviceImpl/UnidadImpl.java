package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.repository.UnidadDao;
import com.g25oo2.dispositivo.service.UnidadService;

@Service
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

	public void eliminar(String id) throws Exception {
		 Optional<Unidad> aux = daoUnidad.findById(id);
		 if(aux.isPresent()) {
			 Unidad Unidad = aux.get();
			 Unidad.setEstado(0);
			 daoUnidad.save(Unidad);
		 }else {
			 throw new Exception("No existe el Unidad a eliminar");
		 }
	}

	
	
}

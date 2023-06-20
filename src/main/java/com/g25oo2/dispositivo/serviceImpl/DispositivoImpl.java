package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.repository.DispositivoDao;
import com.g25oo2.dispositivo.service.DispositivoService;

@Service
public class DispositivoImpl implements DispositivoService{
	@Autowired
	DispositivoDao daoDispositivo;
	
	public List<Dispositivo> traer() {
		return daoDispositivo.findAll();
	}
	
	public void eliminar(int id) throws Exception {
	 Optional<Dispositivo> aux = daoDispositivo.findById(id);
	 if(aux.isPresent()) {
		 Dispositivo dispositivo = aux.get();
		 dispositivo.setEstado(0);
		 daoDispositivo.save(dispositivo);
	 }else {
		 throw new Exception("No existe el dispositivo a eliminar");
	 }
	 
	}
	

}

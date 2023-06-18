package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;

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
	
	

}

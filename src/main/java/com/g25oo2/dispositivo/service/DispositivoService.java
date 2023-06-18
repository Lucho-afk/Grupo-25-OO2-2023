package com.g25oo2.dispositivo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Dispositivo;
@Service
public interface DispositivoService {
	
	
	public List<Dispositivo> traer();

}

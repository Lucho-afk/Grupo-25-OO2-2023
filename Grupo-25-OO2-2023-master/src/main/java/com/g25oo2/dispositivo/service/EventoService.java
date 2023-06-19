package com.g25oo2.dispositivo.service;

import java.util.List;

import com.g25oo2.dispositivo.entity.Evento;

public interface EventoService {
	
	public List<Evento> traer();
	
	public void guardar(Evento evento);
	
	public void eliminar(Evento evento);
	
	

}

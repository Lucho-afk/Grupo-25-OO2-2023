package com.g25oo2.dispositivo.service;

import java.util.List;

import com.g25oo2.dispositivo.entity.Evento;

public interface EventoService {
	
	public List<Evento> traer();
	
	public void guardar(Evento evento);
	
	public void eliminar(int id) throws Exception;
	
	public void modificar(Evento evento, int id) throws Exception;

	public void generarEvento(String idUnidad) throws Exception;

}

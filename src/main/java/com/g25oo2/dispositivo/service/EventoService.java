package com.g25oo2.dispositivo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Evento;

@Service
public interface EventoService {
	
	public List<Evento> traer();
	
	public void guardar(Evento evento);
	
	public void eliminar(int id) throws Exception;
	
	public void modificar(Evento evento, int id) throws Exception;

	public void generarEvento(String idUnidad) throws Exception;
	
	public List<Evento> traerPorUnidad(String unidadNombre) throws Exception;

}

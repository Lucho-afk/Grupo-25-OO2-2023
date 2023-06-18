package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.g25oo2.dispositivo.entity.Evento;
import com.g25oo2.dispositivo.repository.EventoDao;
import com.g25oo2.dispositivo.service.EventoService;

public class EventoImpl implements EventoService {
	@Autowired
	EventoDao daoEvento;

	@Override
	public List<Evento> traer() {
		// TODO Auto-generated method stub
		return daoEvento.findAll();
	}

	@Override
	public void guardar(Evento evento) {
		daoEvento.save(evento);
		
	}

	@Override
	public void eliminar(Evento evento) {
		daoEvento.delete(evento);
		
	}

	
	
	
}

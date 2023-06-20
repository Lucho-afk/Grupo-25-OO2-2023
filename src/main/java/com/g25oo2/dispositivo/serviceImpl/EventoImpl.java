package com.g25oo2.dispositivo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.entity.Evento;
import com.g25oo2.dispositivo.repository.EventoDao;
import com.g25oo2.dispositivo.service.EventoService;

@Service
public class EventoImpl implements EventoService {
	@Autowired
	EventoDao daoEvento;

	@Override
	public List<Evento> traer() {
		return daoEvento.findAll();
	}

	@Override
	public void guardar(Evento evento) {
		daoEvento.save(evento);
		
	}

	public void eliminar(int id) throws Exception {
		 Optional<Evento> aux = daoEvento.findById(id);
		 if(aux.isPresent()) {
			 Evento evento = aux.get();
			 evento.setEstado(0);
			 daoEvento.save(evento);
		 }else {
			 throw new Exception("No existe el evento a eliminar");
		 }
		
	}

	
	
	
}

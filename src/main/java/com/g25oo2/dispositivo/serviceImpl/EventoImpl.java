package com.g25oo2.dispositivo.serviceImpl;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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


	public List<Evento> traer() {
		List<Evento> lstDispositivos = daoEvento.findAll();
		List<Evento> lstActivos =lstDispositivos.stream()
										.filter(disp -> disp.getEstado()!= 0)
										.collect(Collectors.toList());
		return lstActivos;
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


	@Override
	public void modificar(Evento evento, int id) throws Exception {
		 Optional<Evento> aux = daoEvento.findById(id);
		 if(aux.isPresent()) {
			 Evento eventoAux = aux.get();
			 if(eventoAux.equals(evento)) {
				 throw new Exception("el evento que se quiere ingresar es igual al de la base de datos");
			 }else {
				 daoEvento.save(evento);
			 }
		 }else {
			 throw new Exception("el evento que se quiere modificar no existe en la base de datos");
		 }
		
	}


	
	
}

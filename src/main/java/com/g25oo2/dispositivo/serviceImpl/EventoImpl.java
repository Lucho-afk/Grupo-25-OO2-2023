package com.g25oo2.dispositivo.serviceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

	public List<Evento> traerEventosXfechas(@RequestBody LocalDate fechaDesde,@RequestBody LocalDate fechaHasta){
		return null; //filtro que traiga evento por fechas
	}
	
	
}

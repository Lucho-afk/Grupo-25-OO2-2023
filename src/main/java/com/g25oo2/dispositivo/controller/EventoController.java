package com.g25oo2.dispositivo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g25oo2.dispositivo.entity.Evento;
import com.g25oo2.dispositivo.service.EventoService;


@RestController
@RequestMapping("/api")
public class EventoController {
	@Autowired
	EventoService eventoService;
	
	@GetMapping("/evento")
	public List<Evento> traerEventos() {
		List<Evento> aux = eventoService.traer();
		return aux;
	}
	
	@PostMapping("/evento")
	public void crearEvento(@RequestBody Evento body) {
		eventoService.guardar(body);
	}
	
	@DeleteMapping("/evento")
	public void borrarEvento(@RequestBody int body) {
		try {
			eventoService.eliminar(body);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@GetMapping("/eventoXfechas")
	public List<Evento> traerEventosXfechas(@RequestBody LocalDate fechaDesde,@RequestBody LocalDate fechaHasta){
		return null; //filtro que traiga evento por fechas
	}
	
	@GetMapping("/eventosXunidad")
	public List<Evento> eventosXUnidad(@RequestBody String body){
		return null; //implementar filtro  que traiga una lista de eventos por unidad.
	}
	
	@GetMapping("/eventosXunidad")
	public List<Evento> eventosXUnidadEntreFechas(@RequestBody String body,@RequestBody LocalDate fechaDesde,@RequestBody LocalDate fechaHasta){
		return null; //implementar filtro  que traiga una lista de eventos por unidad, entre un rango de fechas.
	}
}

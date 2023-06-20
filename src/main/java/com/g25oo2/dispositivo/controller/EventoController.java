package com.g25oo2.dispositivo.controller;

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
	public void borrarEvento(@RequestBody Evento body) {
		eventoService.eliminar(body);
	}
	
}

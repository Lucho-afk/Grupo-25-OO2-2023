package com.g25oo2.dispositivo.controller;

import java.time.LocalDate;
import java.util.Iterator;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.g25oo2.dispositivo.entity.Evento;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.service.EventoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")
public class EventoController {
	@Autowired
	EventoService eventoService;

	@GetMapping("/evento")
	public List<Evento> traerEventos() {
		List<Evento> aux = eventoService.traer();
		return aux;
	}

	@PostMapping("/evento/Crear")
	public void crearEvento(@RequestBody Evento body) {
		System.out.println("entre al crear de evento");
		eventoService.guardar(body);
	}

	@DeleteMapping("/evento/Eliminar")
	public void borrarEvento(@RequestBody int body) {
		System.out.println("entre al eliminar de evento");
		try {
			eventoService.eliminar(body);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GetMapping("/eventoXfechas")
	public List<Evento> traerEventosXfechas(@RequestBody LocalDateTime fecha) {
		return null; // filtro que traiga evento de una fecha en especifico
	}

	@GetMapping("/eventosXunidad")
	public List<Evento> eventosXUnidad(@RequestParam String nombreUnidad) {
		List<Evento> lstActivos = eventoService.traer().stream()
				.filter(evento -> evento.getUnidad().getId().equals(nombreUnidad)).collect(Collectors.toList());

		return lstActivos;
	}
	
	@PostMapping("/generarEvento")
	public void generarEvento(@RequestParam String idUnidad) {
		try {
			eventoService.generarEvento(idUnidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/eventosXunidadEntreFechas")
	public List<Evento> eventosXUnidadEntreFechas() {
		LocalDateTime fechaDesde = LocalDateTime.of(2023, 06, 01, 10, 30, 00);
		LocalDateTime fechaHasta = LocalDateTime.of(2023, 06, 05, 06, 45, 00);
		List<Evento> lstActivos = eventoService.traer().stream().filter(
				evento -> evento.getFechaHora().isAfter(fechaDesde) && evento.getFechaHora().isBefore(fechaHasta))
				.collect(Collectors.toList());

		for (Evento evento2 : lstActivos) {
			System.out.println(evento2.toString());
		}

		return lstActivos; // implementar filtro que traiga una lista de eventos por
		// unidad, entre un rango
		// de fechas.
	}
}

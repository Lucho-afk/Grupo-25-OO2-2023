package com.g25oo2.dispositivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.service.DispositivoService;
import com.g25oo2.dispositivo.service.UnidadService;


@RestController
@RequestMapping("/api")
public class UnidadController {
	@Autowired
	UnidadService unidadService;
	
	@GetMapping("/unidad")
	public List<Unidad> traerUnidades() {
		List<Unidad> aux = unidadService.traer();
		return aux;
	}
	
	@PostMapping("/unidad")
	public void crearUnidad(@RequestBody Unidad body) {
		unidadService.guardar(body);
	}
	
	@DeleteMapping("/unidad")
	public void borrarUnidad(@RequestBody Unidad body) {
		unidadService.eliminar(body);
	}
	
}

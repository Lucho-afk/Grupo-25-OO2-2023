package com.g25oo2.dispositivo.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.service.DispositivoService;
import com.g25oo2.dispositivo.service.UnidadService;
import com.g25oo2.dispositivo.util.UtilCreateObject;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")

public class UnidadController {
	@Autowired
	UnidadService unidadService;
	DispositivoService dispositivoService;

	@GetMapping("/unidad")
	public List<Unidad> traerUnidades() {
		List<Unidad> aux = unidadService.traer();

		return aux;
	}

	@PostMapping("/unidad/Crear")
	public void crearUnidad(@RequestBody UtilCreateObject body) {
		System.out.println("entre ");
		try {
			unidadService.guardar(body);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/unidad/Eliminar")
	public void borrarUnidad(@RequestBody Unidad body) {
		System.out.println("entre al eliminar de unidad");
		try {
			unidadService.eliminar(body.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping("/unidadesDeDispositivo")
	public List<Unidad> traerUnidadesDeDispositivo(@RequestParam int dispositivo) {
		List<Unidad> lstActivos = unidadService.traer().stream()
				.filter(unidad -> unidad.getDispositivo().getId() == dispositivo)
				.collect(Collectors.toList());
		return lstActivos; // desarrollar filtro de unidades por id de dispositivo.
	}
	
	

}

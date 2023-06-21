package com.g25oo2.dispositivo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.entity.Unidad;
import com.g25oo2.dispositivo.service.DispositivoService;
import com.g25oo2.dispositivo.service.UnidadService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")
public class DispositivoController {
	@Autowired
	DispositivoService dispositivoService;

	@GetMapping("/dispositivos")
	public List<Dispositivo> traerDispositivos() {
		List<Dispositivo> aux = dispositivoService.traer();
		return aux;
	}

	@DeleteMapping("/dispositivo")
	public void borrarDispositivo(@RequestBody int body) {
		try {
			dispositivoService.eliminar(body);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

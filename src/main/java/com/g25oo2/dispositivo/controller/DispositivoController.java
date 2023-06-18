package com.g25oo2.dispositivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.service.DispositivoService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/dispositivo")
public class DispositivoController {
	@Autowired
	DispositivoService dispositivoService;
	
	@GetMapping("/dispositivos")
	public List<Dispositivo> traerDispositivos() {
		List<Dispositivo> aux = dispositivoService.traer();
		System.out.println("rta: "+ aux.toString());
		return aux;
	}
}

package com.g25oo2.dispositivo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.g25oo2.dispositivo.entity.Unidad;
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
	public void borrarUnidad(@RequestBody String body) {
		try {
			unidadService.eliminar(body);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@GetMapping("/unidadXNombre")
	public List<Unidad> filtroPorNombre(@RequestBody int body){
		return null;//desarrollar filtro de unidades por id de dispositivo.
	}
	

	
}

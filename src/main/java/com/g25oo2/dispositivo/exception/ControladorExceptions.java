package com.g25oo2.dispositivo.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/excepcion")
public class ControladorExceptions {

	public static String exceptions(Exception e) {
		e.getMessage();
		return null;
	}

	public String controlada(String mensaje) {
		return mensaje;
	}
	
	@GetMapping("/error")
	public ModelAndView traerDispositivos(Model model) {
		return new ModelAndView("redirect:/error");
	}

	@GetMapping("/error/volver")
	public ModelAndView add() {
		return new ModelAndView("redirect:/");
	}
}

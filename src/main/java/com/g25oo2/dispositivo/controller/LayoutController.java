package com.g25oo2.dispositivo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@CrossOrigin(origins = "*")
public class LayoutController {
	@GetMapping("/")
	public RedirectView redireccion() {
		String nuevaURL = "http://localhost:3000/";  // URL a la que deseas redireccionar
        
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(nuevaURL);
   
        return redirectView;
	}
}

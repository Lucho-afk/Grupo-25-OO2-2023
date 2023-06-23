package com.g25oo2.dispositivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.g25oo2.dispositivo.entity.Dispositivo;
import com.g25oo2.dispositivo.service.DispositivoService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    DispositivoService dispositivoService;

    @GetMapping("/")
    public String traerDispositivos(Model model) {
        model.addAttribute("usuario", "user");
        return "index";
    }
}
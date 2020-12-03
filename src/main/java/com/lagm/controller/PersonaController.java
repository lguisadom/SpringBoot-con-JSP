package com.lagm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lagm.util.Persona;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	@RequestMapping("/formularioPersona")
	public String formularioPersona(@ModelAttribute("persona") Persona persona) {
		return "persona/formularioPersona";
	}

	@RequestMapping("/verPersona")
	public String verPersona(Persona persona) {
		return "persona/verPersona";
	}
}

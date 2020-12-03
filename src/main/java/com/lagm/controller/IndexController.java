package com.lagm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	/* Invocacion:
	 * http://localhost:8087/saludo
	 * */
	@RequestMapping(value = "/saludo")
	public String saludar() {
		return "saludo";
	}
	
	/* Invocacion:
	 * http://localhost:8087/saludo2
	 * http://localhost:8087/saludo2?nombre=Lourdes
	 * */
	@GetMapping("/saludo2")
	public String saludar2(@RequestParam(name = "nombre", required = false, defaultValue = "Luis") String nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "saludo2";
	}
	
	/* Invocacion:
	 * http://localhost:8087/saludo3
	 * http://localhost:8087/saludo3?nombre=Lourdes
	 * */
	@GetMapping("/saludo3")
	public String saludar3(HttpServletRequest request, HttpServletResponse response, Model model) {
		String nombre = request.getParameter("nombre");
		if (nombre == null) {
			nombre = "Luis";
		}
		model.addAttribute("nombre", nombre);
		return "saludo3";
	}
}

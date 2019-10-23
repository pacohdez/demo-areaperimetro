package com.demoareaperimetro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/area-perimetro")
public class AreaPerimetroController {
	
	@GetMapping("")
	public ResponseEntity<String> hola() {
		System.out.println("Hola");
		return new ResponseEntity<String>("Hola mundo",HttpStatus.OK);
	}
	
	@GetMapping("/rectangulo")
	public ModelAndView capturaOperario() {
		ModelAndView mv = new ModelAndView("/capturadatos");
		return mv;
	}

}

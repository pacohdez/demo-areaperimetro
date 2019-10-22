package com.demoareaperimetro;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/prueba")
public class Prueba {
	
	@GetMapping("")
	public ResponseEntity<String> hola() {
		System.out.println("Hola");
		return new ResponseEntity<String>("Hola mundo",HttpStatus.OK);
	}
	
	@GetMapping("/e")
	public ModelAndView capturaOperario() {
		ModelAndView mv = new ModelAndView("/capturaoperarios");
		return mv;
	}

}

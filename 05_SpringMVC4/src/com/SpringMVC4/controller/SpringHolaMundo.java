package com.SpringMVC4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringHolaMundo {
	@RequestMapping("/welcome")
	public ModelAndView holaMundo() {
		String message = "Nuevo mensaje";	
		return new ModelAndView("welcome", "message", message);
	}
	@RequestMapping("/adios")
	public ModelAndView adios() {
		String message = "Nuevo mensaje de adios";	
		return new ModelAndView("adios", "message", message);
	}

}

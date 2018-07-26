package com.scummbar.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorHelloWorld {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView restaurantes() {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
}
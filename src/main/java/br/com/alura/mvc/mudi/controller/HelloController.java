package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
//	@GetMapping("/hello")
//	public String hello(Model model) {
//		model.addAttribute("nome", "Mundo");
//		return "hello";
//	}
	
	@GetMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("nome","Mundo");
		return mv;
	}
}

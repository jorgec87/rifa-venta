package cl.duoc.rifa.venta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.rifa.venta.util.ViewConstants;



@Controller
@RequestMapping("/")
public class HomeController {
	
	
	
	
	
	@GetMapping("/")
	public String redirect() {
		return "redirect:/login/";
	}
	
	@GetMapping("/login")
	public ModelAndView ShowHomeModel() {
		ModelAndView mav = new ModelAndView(ViewConstants.LOGIN);
		return mav;
	}
}

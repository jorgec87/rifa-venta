package cl.duoc.rifa.venta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.rifa.venta.util.ViewConstants;

@Controller
@RequestMapping("/")
public class VentaController {

	
	
	
	@GetMapping("/numeros")
	public ModelAndView ShowNumeros() {
		ModelAndView mav = new ModelAndView(ViewConstants.VENTA);
		return mav;
	}
	
	
	
}

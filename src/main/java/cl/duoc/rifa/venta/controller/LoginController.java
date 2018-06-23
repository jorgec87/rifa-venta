package cl.duoc.rifa.venta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.rifa.venta.util.ViewConstants;


/**
 * Created by jcarrenca on 22-06-2018.
 */
@Controller
public class LoginController {

	
	@GetMapping("/login")
	public ModelAndView ShowLoginModel() {
		ModelAndView mav = new ModelAndView(ViewConstants.LOGIN);
		return mav;
	}
	
	
}

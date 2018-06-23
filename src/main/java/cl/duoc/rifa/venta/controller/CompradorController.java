package cl.duoc.rifa.venta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.rifa.venta.util.ViewConstants;


/**
 * Created by jcarrenca on 22-06-2018.
 */
@Controller
@RequestMapping("/comprador")
public class CompradorController extends Object {
	
	
	@GetMapping("/add")
	public ModelAndView ShowAddComprador() {
		ModelAndView mav = new ModelAndView(ViewConstants.COMPRADOR_ADD);
		return mav;
	}

}

package cl.duoc.rifa.venta.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.duoc.rifa.venta.model.CompradorModel;
import cl.duoc.rifa.venta.service.CompradorService;
import cl.duoc.rifa.venta.util.ViewConstants;


/**
 * Created by jcarrenca on 22-06-2018.
 */
@Controller
@RequestMapping("/comprador")
public class CompradorController extends Object {
	
	@Autowired
	CompradorService compradorService;
	
	
	@GetMapping("/show")
	public String ShowAddComprador(Model model) {
		CompradorModel comprador = new CompradorModel();
		model.addAttribute("comprador", comprador);
		return ViewConstants.COMPRADOR_ADD;
	}

	
	@PostMapping("/add")
	public String AddComprador(@ModelAttribute("comprador") CompradorModel comprador,HttpServletRequest request) {
		Boolean resultado = false;
		System.out.println("ADD COMPRADOR "+ comprador.toString());
		resultado = compradorService.insert(comprador);
		if (resultado) {
			return "redirect:/comprador/show?success";
		}else {
			return "redirect:/comprador/show?error";
		}
		
	}

}

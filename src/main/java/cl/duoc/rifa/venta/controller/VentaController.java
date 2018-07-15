package cl.duoc.rifa.venta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.duoc.rifa.venta.model.CompradorModel;
import cl.duoc.rifa.venta.model.ItemModel;
import cl.duoc.rifa.venta.service.CompradorService;
import cl.duoc.rifa.venta.util.ViewConstants;


/**
 * Created by jcarrenca on 22-06-2018.
 */

@Controller
@RequestMapping("/")
public class VentaController {

	
	@Autowired
	CompradorService compradorService;
	
	
	@GetMapping("/numeros")
	public ModelAndView ShowNumeros() {
	  ModelAndView mav = new ModelAndView(ViewConstants.VENTA);
	  List<ItemModel> combos = new ArrayList<>(); 	 
	  List<CompradorModel> compradores = compradorService.getAll();
	  compradores.forEach(c -> {
		  ItemModel com = new ItemModel();
		   com.setNombre(c.getNombre()+" "+c.getApellido());
		   com.setValor(c.getRut());
		   combos.add(com);
	  });
		mav.addObject("combos", combos);
		return mav;
	}
	
	
	
}

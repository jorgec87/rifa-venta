package cl.duoc.rifa.venta.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cl.duoc.rifa.venta.entity.Comprador;
import cl.duoc.rifa.venta.model.CompradorModel;

@Component
public class CompradorConverter {

	//Entity --> Model
	public CompradorModel entityToModel(Comprador comprador) {
		CompradorModel compradorModel = new CompradorModel();
		compradorModel.setRut(comprador.getRut());
		compradorModel.setNombre(comprador.getNombre());
		compradorModel.setApellido(comprador.getApellido());
		compradorModel.setTelefono(comprador.getTelefono());
		compradorModel.setEmail(comprador.getEmail());
		return compradorModel;
	}
	
	
	//Model --> Entity
	public Comprador ModelToEntity(CompradorModel compradorModel) {
		Comprador comprador = new Comprador();
		comprador.setRut(compradorModel.getRut());
		comprador.setNombre(compradorModel.getNombre());
		comprador.setApellido(compradorModel.getApellido());
		comprador.setTelefono(compradorModel.getTelefono());
		comprador.setEmail(compradorModel.getEmail());
		return comprador;
	}
	
	//List Entity --> List Model
	public List<CompradorModel> ListEntityToListModel(List<Comprador> comprador) {
		List<CompradorModel> listCompradorModel = new ArrayList<>();
		comprador.forEach(c -> listCompradorModel.add(entityToModel(c)));
		return listCompradorModel;
	}
	
	
	
}

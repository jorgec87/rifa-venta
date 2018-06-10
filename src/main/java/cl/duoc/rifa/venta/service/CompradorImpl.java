package cl.duoc.rifa.venta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.duoc.rifa.venta.converter.CompradorConverter;
import cl.duoc.rifa.venta.mapper.CompradorMapper;
import cl.duoc.rifa.venta.model.CompradorModel;

public class CompradorImpl implements CompradorService {

	@Autowired
	CompradorMapper compradorMapper;
	@Autowired
	CompradorConverter compradorConverter;
	
	@Override
	public List<CompradorModel> getAll() {
		return compradorConverter.ListEntityToListModel(compradorMapper.findAll()) ;
	}

}

package cl.duoc.rifa.venta.service;

import java.util.List;

import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.rifa.venta.converter.CompradorConverter;
import cl.duoc.rifa.venta.mapper.CompradorMapper;
import cl.duoc.rifa.venta.model.CompradorModel;

@Service
public class CompradorImpl implements CompradorService {

	@Autowired
	CompradorMapper compradorMapper;
	@Autowired
	CompradorConverter compradorConverter;
	
	@Override
	public List<CompradorModel> getAll() {
		return compradorConverter.ListEntityToListModel(compradorMapper.findAll()) ;
	}
	
	@Override
	public Boolean insert(CompradorModel comprador) {
		Integer salida = compradorMapper.insert(compradorConverter.ModelToEntity(comprador));
		return BooleanUtils.toBooleanObject(salida) ;
	}

}

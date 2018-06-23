package cl.duoc.rifa.venta.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cl.duoc.rifa.venta.entity.Venta;

@Mapper
public interface VentaMapper {

	
	@Select("SELECT"
			+ "id,"
			+ "rifa,"
	 		+ "comprador,"
	 		+ "numero,"
	 		+ "fecha"
	 		+ "vendedor"
	 		+ " from venta") //SQL
	   List<Venta> findAll();
	
	
}

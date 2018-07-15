package cl.duoc.rifa.venta.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cl.duoc.rifa.venta.entity.Comprador;

@Mapper
public interface CompradorMapper {

	
	@Select("SELECT"
			+ " rut,"
			+ " nombre,"
	 		+ " apellido,"
	 		+ " telefono,"
	 		+ " email "
	 		+ " from COMPRADOR") //SQL
	   List<Comprador> findAll();
	
	
	@Insert("INSERT INTO COMPRADOR(rut, nombre, apellido, telefono, email ) VALUES "
			+ "(#{rut}, #{nombre}, #{apellido}, #{telefono}, #{email})")
	public int insert(Comprador comprador);
	
	


	
	
}

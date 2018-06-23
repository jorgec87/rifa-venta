package cl.duoc.rifa.venta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.duoc.rifa.venta.mapper.CompradorMapper;


/**
 * Created by jcarrenca on 22-06-2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RifaVentaApplicationTests {

	@Autowired
	CompradorMapper compradorMapper;
	
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void pruebaConexion() {
		System.out.println("PRUEBA DE CONEXION");
		System.out.println(compradorMapper.findAll().toString());
		
	}
	
	

}

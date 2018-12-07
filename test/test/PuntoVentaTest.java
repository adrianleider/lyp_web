package test;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.lyp_web.dao.Punto_VentaDAO;
import com.lyp_web.models.Puntos_Venta;

public class PuntoVentaTest {

	
	@Test
	public void testObtenerCUITVendedor() {
		
		Punto_VentaDAO dao = new Punto_VentaDAO();
		ArrayList<Puntos_Venta> list = dao.obtenerCUITVendedor(new BigDecimal(2));
		Assert.assertEquals(2, list.size());
		
	}
	
}

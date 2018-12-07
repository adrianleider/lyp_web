package com.lyp_web.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lyp_web.models.Puntos_Venta;
import com.lyp_web.utils.DatabaseUtils;

public class Punto_VentaDAO {
	
   	public static ArrayList<Puntos_Venta> obtenerCUITVendedor(BigDecimal cliweb) {
		
   	   Connection con = null;
 	   PreparedStatement ps = null;
 	   ArrayList<Puntos_Venta> puntos_venta = new ArrayList<Puntos_Venta>();
	
		try {
			con = DatabaseUtils.getConnection();
			ps = con.prepareStatement("SELECT cuit,cond_iva FROM puntos_ventas where cliweb = (?)");
			ps.setBigDecimal(1, cliweb);
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				Puntos_Venta reg = new Puntos_Venta();
				reg.setCuit(rs.getString("cuit"));
				reg.setCond_iva(rs.getInt("cond_iva"));
				
				puntos_venta.add(reg);
			}
			
		} catch (SQLException ex) {
			System.out.println("obtenerCUITVendedor -->" + ex.getMessage());
		} finally {
			DatabaseUtils.close(con);
		}
		
		DatabaseUtils.close(con);
		return puntos_venta;
	} 
	
}

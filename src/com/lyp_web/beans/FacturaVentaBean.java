package com.lyp_web.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.lyp_web.dao.Punto_VentaDAO;
import com.lyp_web.models.Factura;
import com.lyp_web.models.Puntos_Venta;
import com.lyp_web.utils.SessionUtils;

@ManagedBean
public class FacturaVentaBean extends MaestroBean{
	
	private Factura factura; 
	
	private ArrayList<Puntos_Venta> cuit_vendedores = new ArrayList<Puntos_Venta>();
	

	public FacturaVentaBean() {
		super();
		setTitulo_pantalla("Factura de Venta");
	}
	
	public void cargarCondIvaVendedor() {
		
		for (Puntos_Venta punto : cuit_vendedores) {
			if ( punto.getCuit().equals(factura.getCuit_vendedor()) ) {
				factura.setCond_iva_vendedor(punto.getCond_iva());				
			} 			
		}
				
	}

	public ArrayList<Puntos_Venta> getCuit_vendedores() {
		return cuit_vendedores;
	}

	public void setCuit_vendedores(ArrayList<Puntos_Venta> cuit_vendedor) {
		this.cuit_vendedores = cuit_vendedor;
	}

	@PostConstruct
	public void inicializar() {
		
		setFactura(new Factura());
		cuit_vendedores = Punto_VentaDAO.obtenerCUITVendedor(SessionUtils.getCliweb());
		
	}
	
	public void guardar() {
		
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
}

package com.lyp_web.models;

import java.math.BigDecimal;
import java.util.Date;

public class Puntos_Venta {
	
	  private BigDecimal pv_id;
	  private int punto_venta;
	  private String descripcion;
	  private BigDecimal cliweb;
	  private String cuit;
	  private String razon_social;
	  private Date inicio_actividad;
	  private String direccion_comercial;
	  private String ingresos_brutos;
	  private int logo_altura;
	  private int logo_ancho;
	  private int cond_iva;
	  
	public BigDecimal getPv_id() {
		return pv_id;
	}
	public void setPv_id(BigDecimal pv_id) {
		this.pv_id = pv_id;
	}
	public int getPunto_venta() {
		return punto_venta;
	}
	public void setPunto_venta(int punto_venta) {
		this.punto_venta = punto_venta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getCliweb() {
		return cliweb;
	}
	public void setCliweb(BigDecimal cliweb) {
		this.cliweb = cliweb;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public Date getInicio_actividad() {
		return inicio_actividad;
	}
	public void setInicio_actividad(Date inicio_actividad) {
		this.inicio_actividad = inicio_actividad;
	}
	public String getDireccion_comercial() {
		return direccion_comercial;
	}
	public void setDireccion_comercial(String direccion_comercial) {
		this.direccion_comercial = direccion_comercial;
	}
	public String getIngresos_brutos() {
		return ingresos_brutos;
	}
	public void setIngresos_brutos(String ingresos_brutos) {
		this.ingresos_brutos = ingresos_brutos;
	}
	public int getLogo_altura() {
		return logo_altura;
	}
	public void setLogo_altura(int logo_altura) {
		this.logo_altura = logo_altura;
	}
	public int getLogo_ancho() {
		return logo_ancho;
	}
	public void setLogo_ancho(int logo_ancho) {
		this.logo_ancho = logo_ancho;
	}
	public int getCond_iva() {
		return cond_iva;
	}
	public void setCond_iva(int cond_iva) {
		this.cond_iva = cond_iva;
	}

}

package com.lyp_web.models;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	 private BigDecimal idfacturas;
	 private BigDecimal numero_factura;
	 private BigDecimal punto_venta;
	 private int concepto;
	 private Date fecha_factura;
	 private String cuit_vendedor;
	 private int tipo_comprobante;
	 private int  tipo_doc_comprador;
	 private String cuit_comprador;
	 private BigDecimal importe_total;
	 private BigDecimal importe_no_gravado;
	 private BigDecimal importe_gravado;
	 private BigDecimal importe_exento;
	 private BigDecimal importe_iva105;
	 private BigDecimal importe_iva21;
	 private BigDecimal importe_iva27;
	 private BigDecimal importe_iva;
	 private BigDecimal porcentaje_iibb;
	 private BigDecimal importe_iibb;
	 private String cae;
	 private String fecha_vto_cae;
	 private int  cond_iva_vendedor;
	 private int  cond_iva_comprador;
	 private String fecha_serv_desde;
	 private String fecha_serv_hasta;
	 private String fecha_vto_pago;
	 private String nombre_cliente;
	 private String domicilio_cliente;
	 private BigDecimal cliweb;
	 private BigDecimal id_ctacte;
	 private BigDecimal pago_parcial;
	 private String tipo_operacion;
	 private BigDecimal modo_pago;
	 
	public Factura() {
		super();
		

		this.fecha_factura = new Date();

		this.importe_total = new BigDecimal(0.00);
		this.importe_no_gravado = new BigDecimal(0.00);
		this.importe_gravado = new BigDecimal(0.00);
		this.importe_exento = new BigDecimal(0.00);
		this.importe_iva105 = new BigDecimal(0.00);
		this.importe_iva21 = new BigDecimal(0.00);
		this.importe_iva27 = new BigDecimal(0.00);
		this.importe_iva = new BigDecimal(0.00);
		this.porcentaje_iibb = new BigDecimal(0.000);
		this.importe_iibb = new BigDecimal(0.00);
		this.cliweb = new BigDecimal(1);
		this.pago_parcial = new BigDecimal(0.00);
		
	}
	
	public BigDecimal getIdfacturas() {
		return idfacturas;
	}
	public void setIdfacturas(BigDecimal idfacturas) {
		this.idfacturas = idfacturas;
	}
	public BigDecimal getNumero_factura() {
		return numero_factura;
	}
	public void setNumero_factura(BigDecimal numero_factura) {
		this.numero_factura = numero_factura;
	}
	public BigDecimal getPunto_venta() {
		return punto_venta;
	}
	public void setPunto_venta(BigDecimal punto_venta) {
		this.punto_venta = punto_venta;
	}
	public int getConcepto() {
		return concepto;
	}
	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}
	public Date getFecha_factura() {
		return fecha_factura;
	}
	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}
	public String getCuit_vendedor() {
		return cuit_vendedor;
	}
	public void setCuit_vendedor(String cuit_vendedor) {
		this.cuit_vendedor = cuit_vendedor;
	}
	public int getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(int tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public int getTipo_doc_comprador() {
		return tipo_doc_comprador;
	}
	public void setTipo_doc_comprador(int tipo_doc_comprador) {
		this.tipo_doc_comprador = tipo_doc_comprador;
	}
	public String getCuit_comprador() {
		return cuit_comprador;
	}
	public void setCuit_comprador(String cuit_comprador) {
		this.cuit_comprador = cuit_comprador;
	}
	public BigDecimal getImporte_total() {
		return importe_total;
	}
	public void setImporte_total(BigDecimal importe_total) {
		this.importe_total = importe_total;
	}
	public BigDecimal getImporte_no_gravado() {
		return importe_no_gravado;
	}
	public void setImporte_no_gravado(BigDecimal importe_no_gravado) {
		this.importe_no_gravado = importe_no_gravado;
	}
	public BigDecimal getImporte_gravado() {
		return importe_gravado;
	}
	public void setImporte_gravado(BigDecimal importe_gravado) {
		this.importe_gravado = importe_gravado;
	}
	public BigDecimal getImporte_exento() {
		return importe_exento;
	}
	public void setImporte_exento(BigDecimal importe_exento) {
		this.importe_exento = importe_exento;
	}
	public BigDecimal getImporte_iva105() {
		return importe_iva105;
	}
	public void setImporte_iva105(BigDecimal importe_iva105) {
		this.importe_iva105 = importe_iva105;
	}
	public BigDecimal getImporte_iva21() {
		return importe_iva21;
	}
	public void setImporte_iva21(BigDecimal importe_iva21) {
		this.importe_iva21 = importe_iva21;
	}
	public BigDecimal getImporte_iva27() {
		return importe_iva27;
	}
	public void setImporte_iva27(BigDecimal importe_iva27) {
		this.importe_iva27 = importe_iva27;
	}
	public BigDecimal getImporte_iva() {
		return importe_iva;
	}
	public void setImporte_iva(BigDecimal importe_iva) {
		this.importe_iva = importe_iva;
	}
	public BigDecimal getPorcentaje_iibb() {
		return porcentaje_iibb;
	}
	public void setPorcentaje_iibb(BigDecimal porcentaje_iibb) {
		this.porcentaje_iibb = porcentaje_iibb;
	}
	public BigDecimal getImporte_iibb() {
		return importe_iibb;
	}
	public void setImporte_iibb(BigDecimal importe_iibb) {
		this.importe_iibb = importe_iibb;
	}
	public String getCae() {
		return cae;
	}
	public void setCae(String cae) {
		this.cae = cae;
	}
	public String getFecha_vto_cae() {
		return fecha_vto_cae;
	}
	public void setFecha_vto_cae(String fecha_vto_cae) {
		this.fecha_vto_cae = fecha_vto_cae;
	}
	public int getCond_iva_vendedor() {
		return cond_iva_vendedor;
	}
	public void setCond_iva_vendedor(int cond_iva_vendedor) {
		this.cond_iva_vendedor = cond_iva_vendedor;
	}
	public int getCond_iva_comprador() {
		return cond_iva_comprador;
	}
	public void setCond_iva_comprador(int cond_iva_comprador) {
		this.cond_iva_comprador = cond_iva_comprador;
	}
	public String getFecha_serv_desde() {
		return fecha_serv_desde;
	}
	public void setFecha_serv_desde(String fecha_serv_desde) {
		this.fecha_serv_desde = fecha_serv_desde;
	}
	public String getFecha_serv_hasta() {
		return fecha_serv_hasta;
	}
	public void setFecha_serv_hasta(String fecha_serv_hasta) {
		this.fecha_serv_hasta = fecha_serv_hasta;
	}
	public String getFecha_vto_pago() {
		return fecha_vto_pago;
	}
	public void setFecha_vto_pago(String fecha_vto_pago) {
		this.fecha_vto_pago = fecha_vto_pago;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getDomicilio_cliente() {
		return domicilio_cliente;
	}
	public void setDomicilio_cliente(String domicilio_cliente) {
		this.domicilio_cliente = domicilio_cliente;
	}
	public BigDecimal getCliweb() {
		return cliweb;
	}
	public void setCliweb(BigDecimal cliweb) {
		this.cliweb = cliweb;
	}
	public BigDecimal getId_ctacte() {
		return id_ctacte;
	}
	public void setId_ctacte(BigDecimal id_ctacte) {
		this.id_ctacte = id_ctacte;
	}
	public BigDecimal getPago_parcial() {
		return pago_parcial;
	}
	public void setPago_parcial(BigDecimal pago_parcial) {
		this.pago_parcial = pago_parcial;
	}
	public String getTipo_operacion() {
		return tipo_operacion;
	}
	public void setTipo_operacion(String tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}
	public BigDecimal getModo_pago() {
		return modo_pago;
	}
	public void setModo_pago(BigDecimal modo_pago) {
		this.modo_pago = modo_pago;
	}
	
	

}

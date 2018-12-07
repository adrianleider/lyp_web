package com.lyp_web.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.lyp_web.dao.LoginDAO;
import com.lyp_web.utils.SessionUtils;



@ManagedBean
@SessionScoped
public class LoginBean  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6422181449337437657L;
	/**
	 * 
	 */
	
	private String usuario;
	private String password;
	private boolean logueado;
	
	public boolean isLogueado() {
		return logueado;
	}
	public void setLogueado(boolean logueado) {
		this.logueado = logueado;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String ingresar() {
		
	        BigDecimal valid = LoginDAO.validate(usuario, password);
			if (valid.compareTo(new BigDecimal(0)) == 1 ) {
					
				HttpSession session = SessionUtils.getSession();
				session.setAttribute("usuariosession", usuario);
				session.setAttribute("cliweb", valid);
				
				
				return "inicio.faces?faces-redirect=true";
			}else {
				
				FacesContext.getCurrentInstance().addMessage(
						null,
						new FacesMessage(FacesMessage.SEVERITY_WARN,
								"Usuario o Password incorrecto",
								"Por favor vuelva a ingresarlo de nuevo"));
			
				return "logi.faces?faces-redirect=true";
	    
			}	
	    
	        
	}
	
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}
	

}

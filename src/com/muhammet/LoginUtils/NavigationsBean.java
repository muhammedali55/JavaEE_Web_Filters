package com.muhammet.LoginUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="navigationBean")
@SessionScoped
public class NavigationsBean {

	
	public String goLogin() {
		return "login.jsf";
	}
	
	public String goRedirectLogin() {
		return "login.jsf?faces-redirect=true";		
	}
	

	public String goAdmin() {
		return "AdminPanel/index.jsf";
	}
	
	public String goAdminLogin() {
		return "AdminPanel/index.jsf?faces-redirect=true";		
	}
	
	
}

package com.muhammet.Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.muhammet.LoginUtils.NavigationsBean;


@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {

	private String ad;
	private String sifre;
	private String mesaj;
	 private boolean loggedIn;
	
	  @ManagedProperty(value="#{navigationBean}")
	    private NavigationsBean navigationBean;
	
	public String giris() {
		
		if(ad.equals("admin") && sifre.equals("123")) {
			loggedIn = true;
			return navigationBean.goAdminLogin();
		}
		else
		{
			mesaj ="Kullanýcý Adý yada Þifre Hatalý";
			return navigationBean.goLogin();
		}
		
	}

	
	public String getMesaj() {
		return mesaj;
	}


	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public NavigationsBean getNavigationBean() {
		return navigationBean;
	}

	public void setNavigationBean(NavigationsBean navigationBean) {
		this.navigationBean = navigationBean;
	}
	
	
	
	
}

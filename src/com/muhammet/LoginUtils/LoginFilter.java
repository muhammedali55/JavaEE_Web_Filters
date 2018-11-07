package com.muhammet.LoginUtils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.muhammet.Beans.LoginBean;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		  LoginBean loginBean = (LoginBean)((HttpServletRequest)request).getSession().getAttribute("loginBean");
	         
		  System.out.println("Buradayým");
	        // For the first application request there is no loginBean in the session so user needs to log in
	        // For other requests loginBean is present but we need to check if user has logged in successfully
	        if (loginBean == null || !loginBean.isLoggedIn()) {
	            String contextPath = ((HttpServletRequest)request).getContextPath();
	            ((HttpServletResponse)response).sendRedirect(contextPath + "/login.jsf");
	        }
	         
	        chain.doFilter(request, response);
		
	}

}

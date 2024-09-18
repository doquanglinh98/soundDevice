package com.vn.sound.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;

public class CustomAdminFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// Initialization code
	}

//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		HttpServletRequest httpRequest = (HttpServletRequest) request;
//		HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//		HttpSession session = (HttpSession) httpRequest.getSession(false);
//		boolean isAdmin = session != null && session.getAttribute("role") != null
//				&& session.getAttribute("role").equals("admin");
//
//		String requestURI = httpRequest.getRequestURI();
//		if (requestURI.startsWith("/admin") && !isAdmin) {
//			// Redirect to login page or access denied page
//			httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
//		} else {
//			// Allow the request to proceed
//			chain.doFilter(request, response);
//		}
//	}

	@Override
	public void destroy() {
		// Cleanup code
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}
}

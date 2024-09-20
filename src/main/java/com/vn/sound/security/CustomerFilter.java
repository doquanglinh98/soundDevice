package com.vn.sound.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.vn.sound.common.Utility;
import com.vn.sound.service.UserService;

public abstract class CustomerFilter extends OncePerRequestFilter {

	@Autowired
	private UserService userService;

//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//			throws ServletException, IOException {
//		String requestPath = Utility.isNotNull(request.getServletPath()) ? request.getServletPath()
//				: request.getPathInfo();
//		System.out.println("requestPath=" + requestPath);
//		if (requestPath.matches("(/manager/).*")) {
//			if (Utility.isNotNull(request.getParameter("userName"))
//					&& Utility.isNotNull(request.getParameter("passWord"))) {
//				System.out.println("requestPath1");
//				if (userService.isAdmin(requestPath, requestPath)) {
//					System.out.println("requestPath2");
//					chain.doFilter(request, response);
//				} else {
//					response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//				}
//			} else {
//				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//			}
//		}
//		chain.doFilter(request, response);
//
//	}

	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		// HttpServletRequest request = (HttpServletRequest) req;
		// HttpServletResponse response = (HttpServletResponse) resp;
		String requestPath = Utility.isNotNull(request.getServletPath()) ? request.getServletPath()
				: request.getPathInfo();
		System.out.println("requestPath=" + requestPath);
		if (requestPath.matches("(/manager/).*")) {
			if (Utility.isNotNull(request.getParameter("userName"))
					&& Utility.isNotNull(request.getParameter("passWord"))) {
				System.out.println("requestPath1");
				if (userService.isAdmin(requestPath, requestPath)) {
					System.out.println("requestPath2");
					chain.doFilter(request, response);
				} else {
					response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
				}
			} else {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
			}
		}
		chain.doFilter(request, response);
	}

}

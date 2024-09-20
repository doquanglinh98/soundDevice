package com.vn.sound.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vn.sound.common.Utility;
import com.vn.sound.service.UserService;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@WebFilter(urlPatterns = "/*", dispatcherTypes = { DispatcherType.REQUEST })
public class CustomerFilter extends HttpFilter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UserService userService;

	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// HttpServletRequest request = (HttpServletRequest) req;
		// HttpServletResponse response = (HttpServletResponse) res;
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
					System.out.println("loi1");
					response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
				}
			} else {
				System.out.println("loi2");
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
			}
		}
		chain.doFilter(request, response);
	}

}

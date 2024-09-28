package com.vn.sound.security;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

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
		String requestPath = Utility.isNotNull(request.getServletPath()) ? request.getServletPath()
				: request.getPathInfo();
		if (requestPath.matches("(/manager/).*")) {
			if ((requestPath.contains("/micro/") || requestPath.contains("/mixer/") || requestPath.contains("/ampli/")
					|| requestPath.contains("/n9-speaker-series/") || requestPath.contains("/speakers-series/")
					|| requestPath.contains("/micro-tsc-series/") || requestPath.contains("/power-ampli-series/")
					|| requestPath.contains("/mixer-series/") || requestPath.contains("/count/")
					|| requestPath.contains("/login")) && request.getMethod().equals("GET")) {
				// change when deploy
				//response.setHeader("Access-Control-Allow-Origin", "https://tscproaudio.com");
				response.setHeader("Access-Control-Allow-Origin", "*");
				response.setHeader("Access-Control-Allow-Origin", "http://localhost:5500");
				response.addHeader("Access-Control-Allow-Methods", "GET");
				response.addHeader("Access-Control-Allow-Headers",
						"Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
				response.addHeader("Access-Control-Expose-Headers",
						"Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
				response.addHeader("Access-Control-Allow-Credentials", "true");
				chain.doFilter(request, response);
				return; // Stop processing
			}
			final String authorization = request.getHeader("Authorization");
			if (authorization != null && authorization.toLowerCase().startsWith("basic")) {
				// Authorization: Basic base64credentials
				String base64Credentials = authorization.substring("Basic".length()).trim();
				byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
				String credentials = new String(credDecoded, StandardCharsets.UTF_8);
				// credentials = username:password
				final String[] values = credentials.split(":", 2);
				if (userService.isAdmin(values[0], values[1])) {
					// change when deploy
					//response.setHeader("Access-Control-Allow-Origin", "https://tscproaudio.com");
					response.setHeader("Access-Control-Allow-Origin", "*");
					response.setHeader("Access-Control-Allow-Origin", "http://localhost:5500");
					response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, HEAD");
					response.addHeader("Access-Control-Allow-Headers",
							"Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
					response.addHeader("Access-Control-Expose-Headers",
							"Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
					response.addHeader("Access-Control-Allow-Credentials", "true");
					chain.doFilter(request, response);
				} else {
					// Set the response status and message
					response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					response.setContentType("application/json");
					response.getWriter().write(Utility.errMsgUnAuthorize());
					return; // Stop processing
				}
			} else {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.setContentType("application/json");
				response.getWriter().write(Utility.errMsgUnAuthorize());
				return; // Stop processing
			}
		}
		// change when deploy
		//response.setHeader("Access-Control-Allow-Origin", "https://tscproaudio.com");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:5500");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, PATCH, HEAD");
		response.addHeader("Access-Control-Allow-Headers",
				"Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		response.addHeader("Access-Control-Expose-Headers",
				"Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
		response.addHeader("Access-Control-Allow-Credentials", "true");
		chain.doFilter(request, response);
	}

}

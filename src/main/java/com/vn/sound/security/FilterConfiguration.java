package com.vn.sound.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {
	private final CustomerFilter customerFilter;

	@Autowired
	public FilterConfiguration(CustomerFilter customerFilter) {
		this.customerFilter = customerFilter;
	}

	@Bean
	public FilterRegistrationBean<CustomerFilter> myFilterRegistration() {
		FilterRegistrationBean<CustomerFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(customerFilter);
		filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
		return filterRegistrationBean;
	}
}

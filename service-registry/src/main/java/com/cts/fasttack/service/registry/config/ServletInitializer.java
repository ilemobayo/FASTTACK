package com.cts.fasttack.service.registry.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		super.setRegisterErrorPageFilter(false);
		return application.sources(ServiceRegistryApplication.class);
	}

}

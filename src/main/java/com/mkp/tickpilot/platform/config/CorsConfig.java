package com.mkp.tickpilot.platform.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Apply CORS to all endpoints
		.allowedOrigins("*")
		.allowedMethods("*") // Specify allowed HTTP methods
		.allowedHeaders("*") // Specify allowed headers
		// .allowCredentials(true) // Allow credentials (cookies)
		.maxAge(3600); // Set a maximum age for preflight requests (in seconds)
	}
}

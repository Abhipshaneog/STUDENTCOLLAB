package com.Project.StudentCollaborativeApplication.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**")
    .allowedOrigins("http://localhost:3000")
    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow specific HTTP methods
    .allowedHeaders("*") // Allow all headers
    .exposedHeaders("Authorization") // Expose additional headers
    .allowCredentials(true) // Allow credentials (cookies, authorization headers)
    .maxAge(3600); // Cache pre-flight response for 1 hour
	}

}

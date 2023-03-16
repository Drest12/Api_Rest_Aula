package com.idat.springbootapirestaula.app;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Configuracion {
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
               @Override
               public void addCorsMappings(CorsRegistry registry) {
                       registry.addMapping("/**")
                       .allowedOrigins("http://localhost:4401");

               }

        };
    }

}

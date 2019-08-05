package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class CompanyBulletinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyBulletinApplication.class, args);
	}

	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/companyposts/signin").allowedOrigins("http://localhost:4200");
                registry.addMapping("/companyposts/signin").allowCredentials(true);
                
                registry.addMapping("/companyposts/signup").allowedOrigins("http://localhost:4200");
                registry.addMapping("/companyposts/signup").allowCredentials(true);
                
                registry.addMapping("/companyposts/signout").allowedOrigins("http://localhost:4200");
                registry.addMapping("/companyposts/signout").allowCredentials(true);
            }
        };
}
}
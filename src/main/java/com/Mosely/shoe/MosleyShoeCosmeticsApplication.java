package com.Mosely.shoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MosleyShoeCosmeticsApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MosleyShoeCosmeticsApplication.class, args);
	}
	
	
	
	
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }

	    private static Class<MosleyShoeCosmeticsApplication> applicationClass = MosleyShoeCosmeticsApplication.class;
	}

	




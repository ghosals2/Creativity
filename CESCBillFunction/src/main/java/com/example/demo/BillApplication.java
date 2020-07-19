package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BillApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		setRegisterErrorPageFilter(false);
		SpringApplication.run(BillApplication.class, args);
		System.out.println("hello");
	}

}

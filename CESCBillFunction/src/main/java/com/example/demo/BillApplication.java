package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BillApplication extends SpringBootServletInitializer{
	public BillApplication() {
    super();
    setRegisterErrorPageFilter(false); 
}

	public static void main(String[] args) {
		
		SpringApplication.run(BillApplication.class, args);
		System.out.println("hello");
	}

}

package com.cts.bank.appC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.bank.appC.dto.Demo;

@SpringBootApplication
public class AppCApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCApplication.class, args);
		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext();
		an.scan("com");
		an.refresh();
		Demo demo = an.getBean(Demo.class);
		demo.processRequest();
	}

}

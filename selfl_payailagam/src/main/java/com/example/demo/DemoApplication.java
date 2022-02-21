package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext-> which gives context for a java class
		//SpringApplication.run(DemoApplication.class, args)---> which runs a demoapplication as a spring application
		//No qualifying bean of type 'com.example.demo.Home' available----> @component not added ina particular class so that this exception showing
		//ConfigurableApplicationContext context=
				SpringApplication.run(DemoApplication.class, args);
		System.out.printf("newly added");
		System.out.printf("branch1 added");
		System.out.printf("branch2 added");

	//Home h =context.getBean(Home.class);
	}

}

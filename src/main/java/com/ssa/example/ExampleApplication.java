package com.ssa.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(ExampleApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "test"));
	    var ctx = app.run( args);
	    MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
    	System.out.println(myFirstService.tellAStory());
    	System.out.println(myFirstService.getName());
    	System.out.println(myFirstService.getNum());
    	System.out.println(myFirstService.getCustomName());

	}
}

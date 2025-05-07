package com.trial.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context;
		context = SpringApplication.run(MyAppApplication.class, args);//this line is used to run the container(IOC container)

//		Dev obj = new Dev();Normal way to do it
//		obj.build();

		Dev obj = context.getBean(Dev.class);
		obj.build();

	}

}

package com.Starting;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Starting.Interfaces.Car;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		Car newCar = context.getBean("Corolla", Car.class);
		
		System.out.println(newCar.model());
		
		context.close();
		
	}

}

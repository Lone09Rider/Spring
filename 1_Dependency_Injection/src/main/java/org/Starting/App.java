package org.Starting;

import org.Starting.Cars.Corolla;
import org.Starting.Cars.Swift;
import org.Starting.Interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		Car swift = new Swift();
		Car corolla = new Corolla();
		
		System.out.println(swift.specs());
		System.out.println(corolla.specs());
		
		
//		Car myCar = new Swift();
//		System.out.println(myCar.specs());
		
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("Swift", Car.class);
		System.out.println(myCar.specs());
		
		context.close();
		
	}

}

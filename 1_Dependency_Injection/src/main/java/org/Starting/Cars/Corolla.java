package org.Starting.Cars;

import org.Starting.Interfaces.Car;
import org.springframework.stereotype.Component;


@Component("Corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		return "Sedan from Toyota";
	}

}

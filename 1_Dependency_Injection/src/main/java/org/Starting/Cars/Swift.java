package org.Starting.Cars;

import org.Starting.Interfaces.Car;
import org.springframework.stereotype.Component;

@Component("Swift")
public class Swift implements Car {

	@Override
	public String specs() {
		return "Hatchback from Suzuki";
	}

}

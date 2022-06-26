package com.Starting.Cars;

import org.springframework.stereotype.Component;

import com.Starting.Interfaces.Car;


@Component("Swift")
public class Swift implements Car{

	@Override
	public String model() {
		return "Swift Desire";
	}

}

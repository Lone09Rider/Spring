package com.Starting.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Starting.Interfaces.Car;

@Component("Corolla")
public class Corolla implements Car {

//	@Autowired(required = false)
	Engine engine;

//	To Change the Engine and this is Ignored until AutoWired
//	@Autowired
	public void setEngine(Engine engine) {
		engine.type = "V9";
		this.engine = engine;
	}
	
	

	@Autowired
	public Corolla(Engine engine) {
	engine.type = "V9";
	this.engine = engine;
}



	@Override
	public String model() {
		String specs = "Sedan From Toyota with Engine Type : " + engine.type;
		return specs;
	}

}

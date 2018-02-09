package com.hk.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hk.engine.Engine;

@Component
public class Car {

	@Autowired
	private Engine engine;

	public void printData() {
		System.out.println("Engine Name" + engine.getModelYear());
	}

}

package com.hk.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hk.car.Car;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("resource/spring.xml");

		Car car = ac.getBean(Car.class);
		car.printData();

	}

}

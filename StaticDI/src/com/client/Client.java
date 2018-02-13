package com.client;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hk.Car;

public class Client {
	public static void main(String[] args) {
		MethodInvokingFactoryBean m = new MethodInvokingFactoryBean();
		m.setArguments(arguments);
		
	    ApplicationContext ac = new ClassPathXmlApplicationContext("resource/spring.xml");
		
		Car car =(Car) ac.getBean("car");
		car.hello();
		
	}

}

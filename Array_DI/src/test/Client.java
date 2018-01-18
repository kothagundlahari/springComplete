package test;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {


        ApplicationContext ap1 = new ClassPathXmlApplicationContext("resource/car.xml", "resource/engine.xml");

        Car car = (Car) ap1.getBean("car");

        car.printData();





    }
}

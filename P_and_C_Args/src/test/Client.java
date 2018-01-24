package test;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");

        Car car = (Car) ap.getBean("car");
        car.printData();


    }
}

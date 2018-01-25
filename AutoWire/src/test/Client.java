package test;

import beans.Bus;
import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {


        ApplicationContext ap1 = new ClassPathXmlApplicationContext("resource/springConstructor.xml");

        Bus bus = (Bus) ap1.getBean("bus");

        bus.printData();





    }
}
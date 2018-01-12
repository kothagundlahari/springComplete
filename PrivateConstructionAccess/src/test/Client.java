package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Client {
    public static void main(String[] args) throws ClassNotFoundException {

        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");

//        ap.getBean("t");


        try {
            Class c = Class.forName("beans.Test")
                    ;
            Constructor con[] = c.getDeclaredConstructors();
            con[0].setAccessible(true);
            con[0].newInstance(null);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}

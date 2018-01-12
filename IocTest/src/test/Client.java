package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Client {
    public static void main(String[] args) {
        Resource resource = (Resource) new ClassPathResource("resource/spring.xml");

        BeanFactory factory = new XmlBeanFactory((org.springframework.core.io.Resource) resource);

        factory.getBean("t");



    }
}

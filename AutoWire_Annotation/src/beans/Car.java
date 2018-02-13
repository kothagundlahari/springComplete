package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    @Autowired
    @Qualifier("e1")
    private Engine engine;

    public void printData(){
        System.out.println(" Bus engine " + engine.getModelYear());
    }


}

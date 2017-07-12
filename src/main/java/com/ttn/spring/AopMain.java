package com.ttn.spring;
import com.ttn.service.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by shaan on 9/7/17.
 */
//question1
public class AopMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Shape shape = applicationContext.getBean("shape",Shape.class);
        shape.getCircle().display();
        shape.getTriangle().display();
    }
}

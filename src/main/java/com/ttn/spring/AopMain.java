package com.ttn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shaan on 9/7/17.
 */
//question1
public class AopMain {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        ShapeService shapeService = applicationContext.getBean("shapeservices",ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        System.out.println(shapeService.getTriangle().getName());
    }

}

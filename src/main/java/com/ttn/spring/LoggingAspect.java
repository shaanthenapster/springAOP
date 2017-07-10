package com.ttn.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by shaan on 10/7/17.
 */
@Aspect
public class LoggingAspect {

    @Before("this(com.ttn.spring.ShapeService)")
    public void beforeAdvice() {
        System.out.println("running before advice :");
    }


}

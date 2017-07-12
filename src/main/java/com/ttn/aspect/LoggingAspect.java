package com.ttn.aspect;
import com.ttn.component.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by shaan on 10/7/17.
 */
//question1
@Aspect
public class LoggingAspect {
    @Before("execution(void display())")
    void displayInvoked(JoinPoint joinPoint) {
        System.out.println("display before invoked ::" + joinPoint.getSignature().getName());
    }

    @After("execution(void display())")
    void displayAfterInvoked(JoinPoint joinPoint) {
        System.out.println("display after invoked ::" + joinPoint.getSignature().getName());
    }
}



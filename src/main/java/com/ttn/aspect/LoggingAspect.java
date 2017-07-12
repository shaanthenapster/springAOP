package com.ttn.aspect;
import com.ttn.component.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

/**
 * Created by shaan on 10/7/17.
 */
//question1
@Aspect
public class LoggingAspect {
   @Before("this(com.ttn.component.Circle)")
    void displayInvoked(JoinPoint joinPoint){
        System.out.println("display before invoked ::"+joinPoint.getSignature().getName());
    }

    @After("this(com.ttn.component.Circle)")
    void displayAfterInvoked(JoinPoint joinPoint)
    {
        System.out.println("display after invoked ::"+joinPoint.getSignature().getName());
   }
    @Before("this(com.ttn.component.Triangle)")
    void displaybeforeInvoked(JoinPoint joinPoint){
        System.out.println("display before invoked ::"+joinPoint.getSignature().getName());
    }

    @After("this(com.ttn.component.Triangle)")
    void displaytriangleAfterInvoked(JoinPoint joinPoint)
    {
        System.out.println("display after invoked ::"+joinPoint.getSignature().getName());
    }
   /*
    @AfterThrowing(pointcut = "execution(void display())",throwing = "ex")
    void afterThrowing(IOException ex){
      System.out.println("Exception raised "+ ex);
    }
*/
/*
    @After("execution( * com.ttn.component.Circle.*(..))")
    public void beforeloggingadvice(JoinPoint joinPoint)
    {
        System.out.println("advice running before :"+joinPoint.getSignature().getName());
    }*/

   /* @After("com.ttn.aspect.LoggingAspect.allservicemethods()")
    public void afterloggingadvice(JoinPoint joinPoint)
    {
        System.out.println("Advice running after method :" );
    }

    @Pointcut("execution(* com.ttn.component.Circle.get*(..))")
    public void allservicemethods(){}*/

}



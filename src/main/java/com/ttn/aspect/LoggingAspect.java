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
   @Before("args(String)")
    void displayInvoked(JoinPoint joinPoint){
        System.out.println("display before invoked ::"+joinPoint.getSignature().getName());
    }

    @After("args(String)")
    void displayAfterInvoked(JoinPoint joinPoint)
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



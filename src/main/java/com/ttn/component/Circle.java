package com.ttn.component;
import java.io.IOException;

/**
 * Created by shaan on 9/7/17.
 */
public class Circle {
    public void display() throws IOException {
        System.out.println("inside circle class display method :");
        throw new IOException();
    }
}
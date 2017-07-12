package com.ttn.component;

import java.io.IOException;

/**
 * Created by shaan on 9/7/17.
 */
//question1
public class Triangle {
    public void display() throws IOException {
        System.out.println("inside triangle class display method :");
        throw new IOException();
    }
}

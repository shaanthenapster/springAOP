package com.ttn.service;

import com.ttn.component.Circle;
import com.ttn.component.Triangle;

/**
 * Created by shaan on 12/7/17.
 */
public class Shape {
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    Circle circle;
    Triangle triangle;
}

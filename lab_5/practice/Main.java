package com.example.main;

import com.example.shapes.Circle;
import com.example.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area of circle " + circle.area());
    }
}

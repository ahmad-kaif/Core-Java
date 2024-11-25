package com.example.shapes;


public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle with radius "+ radius);
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

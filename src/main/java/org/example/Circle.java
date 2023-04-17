package org.example;

public class Circle {
    private double radius =1.0;
    private String color="Red";
    final double PI=3.14;

    Circle(){

    }
    Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius*PI;
    }
}

package com.keyin.qap4.problem2;

// Advanced Programming Java - QAP 4
// Developer: Chris Doucette
// Date Created: Tuesday, November 22, 2022

public class Circle extends Shape {

    // Instance variables
    private double radius;

    // Constructors
    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(String color, boolean isFilled, String name, double radius){
        super(color, isFilled, name);
        this.radius = radius;
    }

    // Setters and Getters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overridden Methods
    @Override
    public double getArea(){
        return Math.pow(Math.PI * this.radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public void scale(double scale){
        this.setRadius(this.getRadius() * scale);
    }

    @Override
    public String toString() {
        return super.toString() + " area: " + this.getArea() + " perimeter: " + getPerimeter() + " (radius: " + this.radius + ")";
    }
}

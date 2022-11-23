package com.keyin.qap4.problem2;

// Advanced Programming Java - QAP 4
// Developer: Chris Doucette
// Date Created: Wednesday, November 23, 2022

public class Triangle extends Shape {
    // Instance variables
    private double side1;
    private double side2;
    private double side3;

    // Constructors
    public Triangle(){
        super();

        this.side1 = 1.0;
        this.side2 = 1.5;
        this.side3 = 2.0;
    }

    public Triangle(String color, boolean isFilled, String name, double side1, double side2, double side3){
        super(color, isFilled, name);

        if(isTriangle(side1, side2, side3) == false){
            System.exit(0);
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Setters and Getters
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Custom Methods
    private boolean isTriangle(double side1, double side2, double side3){
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            return true;
        } else {
            System.out.println(side1+side2>side3);
            System.out.println(side2+side2>side1);
            System.out.println(side3+side1>side2);
            System.out.println("Not a valid Triangle");
            return false;
        }
    }

    public double getArea(){
        return this.side1 + this.side2+this.side3;
    }

    public double getPerimeter(){
        double s = (this.side1 + this.side2 + this.side3) / 2;

        double area = s * (s-this.side1) * (s-this.side2) * (s-this.side3);

        return Math.sqrt(area);
    }

    public void scale(double scale){
        this.setSide1(this.getSide1() * scale);
        this.setSide2(this.getSide2() * scale);
        this.setSide3(this.getSide3() * scale);
    }

    @Override
    public String toString() {
        return super.toString() + " area: " + this.getArea() + " perimeter: " + this.getPerimeter() + " (Side 1: " + this.side1 + ", Side 2: " + this.side2 + ", Side 3: " + this.side3 + ")";
    }
}

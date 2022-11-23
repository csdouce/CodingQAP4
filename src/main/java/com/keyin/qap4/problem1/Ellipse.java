package com.keyin.qap4.problem1;

// Advanced Programming Java - QAP 4
// Developer: Chris Doucette
// Date Created: Tuesday, November 22, 2022

public class Ellipse  extends Shape{
    // Instance Variables
    private double axesA;
    private double axesB;

    // Constructors
    public Ellipse(){
        super();
        this.axesA = 1.5;
        this.axesB = 1.0;
    }

    public Ellipse(String color, boolean isFilled, String name, double firstAxes, double secondAxes){
        super(color, isFilled, name);

        if(secondAxes > firstAxes){
            this.axesA = secondAxes;
            this.axesB = firstAxes;
        } else {
            this.axesA = firstAxes;
            this.axesB = secondAxes;
        }
    }

    // Getters and Setters
    public double getAxesA() {
        return axesA;
    }

    public void setAxesA(double axesA) {
        this.axesA = axesA;
    }

    public double getAxesB() {
        return axesB;
    }

    public void setAxesB(double axesB) {
        this.axesB = axesB;
    }

    @Override
    public double getArea(){
        // Area = PIE * a * b
        return Math.PI * this.axesA * this.axesB;
    }

    @Override
    public double getPerimeter(){
        double perimeter;

        if (this.axesA == this.axesB){
            // Both axes are the same so formula would be same as a Circle
            perimeter = 2 * Math.PI * this.axesA;
        } else {
            // Formula for an Ellipse
            perimeter = Math.PI * Math.sqrt(2 * (Math.pow(this.axesA, 2) + Math.pow(this.axesB, 2) - Math.pow(this.axesA - this.axesB, 2)/2));
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + " area: " + this.getArea() + " perimeter: " + this.getPerimeter();
    }
}

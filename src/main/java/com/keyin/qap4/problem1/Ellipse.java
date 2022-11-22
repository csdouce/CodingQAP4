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

    public Ellipse(String color, boolean isFilled, double firstAxes, double secondAxes){
        super(color, isFilled);

        if(secondAxes > firstAxes){
            this.axesA = secondAxes;
            this.axesB = firstAxes;
        } else {
            this.axesA = firstAxes;
            this.axesB = secondAxes;
        }
    }

    @Override
    public double getArea(){
        // Area = PIE * a * b
        return 1.0;
    }

    @Override
    public double getPerimeter(){

        return 1.0;
    }
}

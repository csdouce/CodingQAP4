package com.keyin.qap4.problem1;

// Advanced Programming Java - QAP 4
// Developer: Chris Doucette
// Date Created: Tuesday, November 22, 2022

abstract class Shape {
    // Common Instance Variables
    private String color;
    private boolean isFilled;

    // Constructors
    public Shape(){
        this.color = "purple";
        this.isFilled = true;
    }

    public Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }


    // Common Methods
    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }
}

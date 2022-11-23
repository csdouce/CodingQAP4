package com.keyin.qap4.problem2;

// Advanced Programming Java - QAP 4
// Developer: Chris Doucette
// Date Created: Tuesday, November 22, 2022

abstract class Shape implements Scalable{
    // Common Instance Variables
    private String color;
    private boolean isFilled;
    private String name;

    // Constructors
    public Shape(){
        this.color = "purple";
        this.isFilled = true;
        this.name = "Shape";
    }

    public Shape(String color, boolean isFilled, String name){
        this.color = color;
        this.isFilled = isFilled;
        this.name = name;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Common Methods
    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Name: " + this.name + " color: " + this.color + " is filled: " + this.isFilled;

    }
}

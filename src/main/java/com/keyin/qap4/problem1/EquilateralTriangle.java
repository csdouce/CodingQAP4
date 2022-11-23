package com.keyin.qap4.problem1;

public class EquilateralTriangle extends Triangle{
    // Constructors
    public EquilateralTriangle(double side){
        super();
        setSides(side);
    }

    public EquilateralTriangle(String color, boolean isFilled, String name, double side){
        super(color, isFilled, name, side, side, side);
    }

    // Getters and Setters
    public double getSides(){
        return super.getSide1();
    }

    public void setSides(double side){
        super.setSide1(side);
        super.setSide2(side);
        super.setSide3(side);
    }
}

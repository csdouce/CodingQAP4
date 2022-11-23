package com.keyin.qap4.problem1;

public class Test {

    public static void main(String[] args) {

        // Creating objects
        Circle c1 = new Circle("Grey", false, "MyCircle", 5);
        Ellipse e1 = new Ellipse("Red", true, "MyEllipse1", 3.0, 2.5);
        Ellipse e2 = new Ellipse("Orange", false, "MyEllipse2", 1.750, 2.25);
        Triangle t1 = new Triangle("Green", true, "MyTriangle", 1.5, 3.25, 2.00);
        EquilateralTriangle et1 = new EquilateralTriangle("Blue", true, "MyEquilateralTriangle", 5);

        // Creating array
        Shape[] myShapes = {c1, e1, e2, t1, et1};

        // Iterate over array and print toStrings
        for(Shape shape : myShapes){
            System.out.println(shape);
        }

        }
    }

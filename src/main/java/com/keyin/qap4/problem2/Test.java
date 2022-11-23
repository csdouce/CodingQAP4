package com.keyin.qap4.problem2;

public class Test {

    // Method to add the scale to Array
    static void addScale(Shape[] shapes, double toScale){
        for (Shape shape : shapes){
            shape.scale(toScale);
        }
    }

    public static void main(String[] args) {

        // Creating objects
        Circle c1 = new Circle("Grey", false, "MyCircle", 5);
        Ellipse e1 = new Ellipse("Red", true, "MyEllipse1", 3.0, 2.5);
        Ellipse e2 = new Ellipse("Orange", false, "MyEllipse2", 1.750, 2.25);
        Triangle t1 = new Triangle("Green", true, "MyTriangle", 1.5, 3.25, 2.00);
        EquilateralTriangle et1 = new EquilateralTriangle("Blue", true, "MyEquilateralTriangle", 5);

        // Creating array
        Shape[] myShapes = {c1, e1, e2, t1, et1};

        System.out.println("Printing out objects before Scale is calculated");
        // Iterate over array and print toStrings
        for(Shape shape : myShapes){
            System.out.println(shape);
        }

        // Scaling objects with addScale method
        addScale(myShapes, 2.0);

        // Printing array after the scale
        System.out.println();
        System.out.println("Printing out objects after Scale is calculated");
        for(Shape shape : myShapes){
            System.out.println(shape);
        }

        }
    }

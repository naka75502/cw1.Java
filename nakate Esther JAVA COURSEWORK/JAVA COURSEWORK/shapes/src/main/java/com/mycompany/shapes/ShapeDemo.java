/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

public class ShapeDemo {

    public static void main(String[] args) {

        try {

            Circle c =
                new Circle(5, "Red", true);

            Rectangle r =
                new Rectangle(4, 6,
                              "Blue", false);

            Triangle t =
                new Triangle(3, 4, 5,
                             "Green", true);

            Shape[] shapes = {c, r, t};

            printAreas(shapes);

            System.out.println(
                    "\nLargest Shape:");

            System.out.println(
                    largest(shapes));

            // Invalid Triangle
            Triangle bad =
                new Triangle(2, 3, 10,
                             "Black", true);

        }
        catch (InvalidShapeException e) {

            System.out.println(
                    "Exception Caught: "
                    + e.getMessage());
        }
    }

    public static void printAreas(
            Shape[] shapes) {

        for (Shape s : shapes) {
            System.out.println(
                    s + " Area = "
                    + s.getArea());
        }
    }

    public static Shape largest(
            Shape[] shapes) {

        Shape largest = shapes[0];

        for (Shape s : shapes) {

            if (s.getArea() >
                largest.getArea()) {

                largest = s;
            }
        }

        return largest;
    }
}
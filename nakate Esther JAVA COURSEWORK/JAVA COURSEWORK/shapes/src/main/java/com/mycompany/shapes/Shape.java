/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

public abstract class Shape {

    protected String color = "white";
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void resize(double factor)
            throws InvalidShapeException;

    @Override
    public String toString() {
        return "Color = " + color +
               ", Filled = " + filled;
    }
}
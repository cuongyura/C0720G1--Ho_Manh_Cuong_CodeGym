package __7_abtractclass_and_interface.bai_tap._2_interface_colorable._circle;

import __7_abtractclass_and_interface.bai_tap._2_interface_colorable._shape.Shape;

public class Circle extends Shape {

    // properties:
    private double radius = 1.0;

    // method constructor:

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }


    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}

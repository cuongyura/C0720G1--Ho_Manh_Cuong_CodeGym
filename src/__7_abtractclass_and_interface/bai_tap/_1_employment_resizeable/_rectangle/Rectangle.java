package __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._rectangle;

import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable.Resizeable;
import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._shape.Shape;

public class Rectangle extends Shape implements Resizeable {

    // properties:
    private double width = 1.0;
    private double length = 1.0;

    // method constructor:

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // set and get:


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()+(percent/100));
        setLength(getLength()+(percent/100));
    }
}

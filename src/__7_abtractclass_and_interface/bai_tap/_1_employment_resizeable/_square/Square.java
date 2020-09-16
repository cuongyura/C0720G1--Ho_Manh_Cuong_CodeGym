package __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._square;
import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._shape.Shape;

public class Square extends Shape {

    // properties:

    private double side = 0;

    // method constructor:

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    // get and set:


    public double getSide() {
        return side;
    }
    @Override
    public double getArea() {
        return side*side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+(percent/100));
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

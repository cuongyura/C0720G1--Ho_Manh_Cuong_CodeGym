package __7_abtractclass_and_interface.bai_tap._2_interface_colorable._square;

import __7_abtractclass_and_interface.bai_tap._2_interface_colorable.IColorable;
import __7_abtractclass_and_interface.bai_tap._2_interface_colorable._shape.Shape;

public class Square extends Shape implements IColorable {

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
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}

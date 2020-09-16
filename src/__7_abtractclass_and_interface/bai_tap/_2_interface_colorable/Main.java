package __7_abtractclass_and_interface.bai_tap._2_interface_colorable;


import __7_abtractclass_and_interface.bai_tap._2_interface_colorable._circle.Circle;
import __7_abtractclass_and_interface.bai_tap._2_interface_colorable._rectangle.Rectangle;
import __7_abtractclass_and_interface.bai_tap._2_interface_colorable._shape.Shape;
import __7_abtractclass_and_interface.bai_tap._2_interface_colorable._square.Square;


public class Main {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(7.0);
        array[1] = new Rectangle(7.0,3.8);
        array[2] = new Square(7.0);


        for (Shape shape : array) {

            if(shape instanceof Circle){
                System.out.println("Area Circle front is: ");
                System.out.println(shape.getArea());
            }

            if(shape instanceof Rectangle){
                System.out.println("Area rectangle front is: ");
                System.out.println(shape.getArea());
            }


            if (shape instanceof IColorable) {
                Square square = (Square) shape;
               /* IColorable iColorable = (IColorable) shape;*/
                square.howToColor();
            }


        }
    }
}

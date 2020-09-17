package __7_abtractclass_and_interface.bai_tap._1_employment_resizeable;

import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._cricle.Circle;
import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._rectangle.Rectangle;
import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._shape.Shape;
import __7_abtractclass_and_interface.bai_tap._1_employment_resizeable._square.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(7.0);
        array[1] = new Rectangle(7.0,3.8);
        array[2] = new Square(7.0);

        // area front:

        for (Shape shape : array){
            System.out.println(shape);

            if(shape instanceof Circle){
                System.out.println("Area Circle front is");
                System.out.println(shape.getArea());
            }

            if(shape instanceof Rectangle){
                System.out.println("Area rectangle front is");
                System.out.println(shape.getArea());
            }

            if(shape instanceof Square){
                System.out.println("Area Square front is");
                System.out.println(shape.getArea());
            }

            double percent = Math.random();
            shape.resize(percent);
            System.out.println(shape);

            if(shape instanceof Circle){
                System.out.println("Area Circle behind is: ");
                System.out.println(shape.getArea());
            }

            if(shape instanceof Rectangle){
                System.out.println("Area rectangle behind is: ");
                System.out.println(shape.getArea());
            }

            if(shape instanceof Square){
                System.out.println("Area Square behind is: ");
                System.out.println(shape.getArea());
            }


        }


    }
}

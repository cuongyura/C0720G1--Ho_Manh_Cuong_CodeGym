package __04_class_and_object.thuc_hanh.__Lop_Chu_Nhat;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(" Please input width: ");
        double width = sc.nextDouble();

        System.out.println(" Please input height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("You Rectangle \n: ");
        rectangle.display();

        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());





    }
}

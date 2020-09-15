package __6_extend.bai_tap._1_classcircle_and_classcynlinder;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Please input radius: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Please input color: ");
        String color = scanner.nextLine();
        System.out.println("Please input height: ");
        double height = scanner.nextDouble();
        Circle circle = new Circle(radius,color);
        System.out.println(circle.toString());
        System.out.println("area circle is: ");
        System.out.println(circle.areaCircle());
        System.out.println("perimeter circle is: ");
        System.out.println(circle.perimeterCircle());
        Cylinder cylinder = new Cylinder(radius,color,height);
        System.out.println(cylinder.toString());
        System.out.println("volume cylinder is: ");
        System.out.println(cylinder.volumeCylinder());

    }
}

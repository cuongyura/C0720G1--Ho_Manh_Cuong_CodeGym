package __15_handing_exp_and_debug_java.bai_tap._1_usw_class_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag;
        do {

            // input three side of triangle:

            System.out.println("Please input a: ");
            double a = scanner.nextDouble();
            System.out.println("Please input b: ");
            double b = scanner.nextDouble();
            System.out.println("Please input c: ");
            double c = scanner.nextDouble();

            flag = ((a + b) > c) && (a + c) > b && (b + c > a) && (a > 0) && b > 0 && c > 0;

            if(!flag) {
                try {
                    throw new IllegalTriangleException();
                } catch (IllegalTriangleException e) {
                    e.printStackTrace();
                }
            }


        } while (!flag);

        System.out.println("Complete!>>>>");
    }
}

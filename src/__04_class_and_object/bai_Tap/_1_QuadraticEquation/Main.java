package __04_class_and_object.bai_Tap._1_QuadraticEquation;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input a: ");
        double a = sc.nextDouble();

        System.out.println("Please input b: ");
        double b = sc.nextDouble();

        System.out.println("Please input c: ");
        double c = sc.nextDouble();

        // create a object:

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        double result = quadraticEquation.getDiscriminant(a,b,c);

        if (result > 0) {
            System.out.println("delta > 0 " + "\nx1 = "+quadraticEquation.getRoot1()
                                            + "\nx2 = "+quadraticEquation.getRoot2());
        } else {

            if (result == 0){
                System.out.println("delta == 0 :" + " x1 equal x2 : "+(-b/(2*a)));
             } else if (result < 0){
                System.out.println("The equation has no roots");
             }
        }

    }
}

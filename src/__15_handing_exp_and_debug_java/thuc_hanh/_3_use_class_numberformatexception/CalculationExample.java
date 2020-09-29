package __15_handing_exp_and_debug_java.thuc_hanh._3_use_class_numberformatexception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input value x: ");
        int x = scanner.nextInt();

        System.out.println("Please input value y: ");
        int y = scanner.nextInt();
        calculate(x,y);
    }

    public static void calculate(int x, int y){
        try {

            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("total x + y = " + a);
            System.out.println("total x - y = " + b);
            System.out.println("total x * y = " + c);
            System.out.println("total x / y = " + d);

        } catch (Exception e) {
            System.out.println(" happening exp"+e.getMessage());
        }
    }
}

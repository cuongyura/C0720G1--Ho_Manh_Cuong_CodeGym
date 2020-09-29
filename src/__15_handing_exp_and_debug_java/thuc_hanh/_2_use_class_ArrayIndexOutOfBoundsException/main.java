package __15_handing_exp_and_debug_java.thuc_hanh._2_use_class_ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayExample arrayExample = new ArrayExample();
        Integer[] arrInteger = arrayExample.createRandom();

        System.out.println("\nPlease input index of a elements any: ");
        int x = scanner.nextInt();

        try {
            System.out.println("Value of elements have index  5" + x + " is: " + arrInteger[x]);
           } catch (Exception e) {
            System.out.println("Error: index exceed limit of array!");
        }
        }
}

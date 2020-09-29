package __14_algorythm_sort.thuc_hanh._1_algorythm_bubble_sort;

import java.util.Scanner;

public class BubbleSortByStep {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // declare size array:

        System.out.println("Please input size: ");
        int size = scanner.nextInt();
        int list[] = new int[size];

        // input array Integer:

        for (int index = 0; index < list.length; index++){
            System.out.println("Please input element " + (index + 1)+": ");
            list[index] = scanner.nextInt();
        }

        // show array Integer:
        System.out.println("List: ");
        for (int index = 0; index < list.length; index++) {
            System.out.print("["+list[index] +"]"+ "\t");
        }

        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);

    }



    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}

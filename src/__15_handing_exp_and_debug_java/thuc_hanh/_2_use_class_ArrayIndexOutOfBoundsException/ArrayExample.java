package __15_handing_exp_and_debug_java.thuc_hanh._2_use_class_ArrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {

    public Integer[] createRandom() {

        Random rd = new Random();
        Integer[] arrInteger = new Integer[100];

        System.out.println("List elements of array: ");

        for(int i = 0; i < 100; i++) {
            arrInteger[i] = rd.nextInt(100);
            System.out.print("[ "+arrInteger[i]+"]" + " ");
        }
        return arrInteger;
    }
}

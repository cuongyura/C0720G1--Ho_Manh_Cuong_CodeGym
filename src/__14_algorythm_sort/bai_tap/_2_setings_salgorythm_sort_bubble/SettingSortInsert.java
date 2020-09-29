package __14_algorythm_sort.bai_tap._2_setings_salgorythm_sort_bubble;

public class SettingSortInsert {
    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;

        // loop all number:
        for (i = 1; i < arr.length; i++) {

            // selection a value to insert:

            valueToInsert = arr[i];

            // selection location to insert

            holePosition = i;

             // check see number precede have elder value have insert

            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {

                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("move elements: : " + arr[holePosition]);
            }

            if (holePosition != i) {
                System.out.println(" insert elements: " + valueToInsert
                        + ", in location: " + holePosition);
                // insert elements in location insert
                arr[holePosition] = valueToInsert;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

}

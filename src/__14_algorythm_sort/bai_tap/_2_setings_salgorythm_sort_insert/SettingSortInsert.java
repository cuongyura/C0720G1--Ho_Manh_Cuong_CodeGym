package __14_algorythm_sort.bai_tap._2_setings_salgorythm_sort_insert;

public class SettingSortInsert {
    public static void main(String[] args) {
        int[] list = {2, 9, 5, 4, 8, 1, 6};
        insertionSort(list);
        System.out.println("List: ");
        for (int i = 0; i < list.length; i++){
            System.out.print("|" + list[i] +"|"+" ");
        }
    }
    public static void insertionSort(int[] list) {

     for (int i = 1; i < list.length; i++) {
        int currentElement = list[i];
        int k;
        for (k = i -1; k >= 0 && list[k] > currentElement; k--) {
            list[k + 1] = list[k];
        }

        list[k + 1] = currentElement;
     }
    }

}

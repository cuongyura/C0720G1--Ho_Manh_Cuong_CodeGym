package __14_algorythm_sort.op;

public class DemoSortBubble {
    public static void bubbleSort(int listArr[]){
        boolean check= true;

        for (int i = 0; i < listArr.length - 1; i++){
            check = false;
            for (int j = 0; j < listArr.length - i - 1; j++){
                if(listArr[j] > listArr[j + 1]){
                    int temp = listArr[j];
                    listArr[j] = listArr[j + 1];
                    listArr[j + 1] = temp;
                    check = true;
                }
            }
        }

    }
    public static void main(String[] args) {
        int listArr[] ={1, 5, 4, 2, 6, 8, 6, 44, 23};
        bubbleSort(listArr);
        for (int i = 0; i < listArr.length; i++ ){
            System.out.print(listArr[i]+" ");
        }
    }
}

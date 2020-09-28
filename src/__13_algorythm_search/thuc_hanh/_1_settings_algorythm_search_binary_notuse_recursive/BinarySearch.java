package __13_algorythm_search.thuc_hanh._1_settings_algorythm_search_binary_notuse_recursive;

public class BinarySearch {
    /*binary search:
    * - thuật toán tìm kiếm một phần tử ở vị trí ở giữa của tập dữ liệu.
    * - nếu giá trị tìm thấy thì trả về vị trí index.
    * - còn nếu ko tìm thấy:
    * - phần tử cần tìm > giá trị ở giữa => phần tử cần tìm nằm bên phải phần tử ở giữa.
    * - nếu ko phần tử cần tìm nằm bên trái phần tử ở giữa.
    * - tiến trình sẽ được thực hiện đến khi tìm ra phần tử
    * - còn ko tìm ra thì trả về  -1
    * */

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,11));
        System.out.println(binarySearch(list,79));
        System.out.println(binarySearch(list,1));
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,8));
    }
    // declare array list integer:
    public static int[] list = {2, 4, 7, 10, 11, 45, 50, 60, 66, 69, 70, 79};

    // method to search binary:
    public static int binarySearch(int[] list, int key) {

    int low = 0;
    int high = list.length - 1;

    while (high >= low ) {

     int mid = (low + high ) / 2;

     if(key < list[mid])  high = mid - 1;
     else if (key == list[mid]) return mid;
     else low = mid + 1;
    }

    return -1; // not found
 }
}


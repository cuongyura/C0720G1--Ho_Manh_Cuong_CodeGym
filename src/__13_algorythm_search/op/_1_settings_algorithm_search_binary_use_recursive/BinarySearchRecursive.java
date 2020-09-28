package __13_algorythm_search.op._1_settings_algorithm_search_binary_use_recursive;

public class BinarySearchRecursive {
    int binarySearch(int arr[], int left, int right, int x) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            // if arr[mid] equal x, return index and end.
            if (arr[mid] == x)
                return mid;

            // if arr[mid] > x, call recursive find left
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            // else, if arr[mid] < x, call recursive find right.
            return binarySearch(arr, mid + 1, right, x);
        }

        // not found.
        return -1;
    }

    public static void main(String args[]) {
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("not found element: " + x);
        else
            System.out.println("Element: " + x + " be found in element: " +
                    result);
    }
}


package __04_class_and_object.bai_Tap._2_Stop_Watch;

public class Main {
    public static void main(String[] args) {

        // Call out object cua StopWatch:

        StopWatch stopWatch = new StopWatch();

        // use method start()
        stopWatch.start();

        // create a array including 100.000 number, random from 0 in 1000000:
        int[] arr = new int[1000000];
        sort(arr);

        // User method stop():
        stopWatch.stop();
        // print rage time center start and end:
        System.out.println(" Print= " + stopWatch.getElapsedTime());
    }
    public static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    }

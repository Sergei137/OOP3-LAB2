import java.util.Arrays;

public class QuickSortClass {
    public static void qsc(int[] array){
        System.out.println("Quick sort");

        // find length of array and set it to n
        int n = array.length; // n = 11
        int  lower = 0;
        int upper = n - 1; // n = 10

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        // quick sort
        quickSort(array, lower, upper);

        // print sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }

    // quick sort method - O(n^2)
    public static void quickSort(int[] array, int lower, int upper){
        
    }
}

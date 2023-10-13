import java.util.Arrays;

public class QuickSortClass {
    public static void main(int[] array){
        System.out.println("Quick sort");

        // find length of array and set it to n
        int n = array.length; // n = 11

        // set lower and upper bounds
        int  lower = 0;
        int upper = n - 1; // upper = 10

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        // quick sort - O(n^2)
        quickSort(array, lower, upper);

        // print sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }

    // quick sort method
    public static void quickSort(int[] array, int lower, int upper){
        if (lower < upper) {
            int pivotIndex = partition(array, lower, upper);

        }
    }

    // partition method
    public static int partition(int[] array, int lower, int upper){

        //for ()


        int temp = 0;

        return 0;
    }
}

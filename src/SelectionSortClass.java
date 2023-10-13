import java.util.Arrays;

public class SelectionSortClass {
    public static void ssc(int[] array){
        System.out.println("Selection sort");

        // find length of array and set it to n
        int n = array.length; // 11

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // selection sort
        selectionSort(array, n);

        // print sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }

    // selection sort - O(n^2)
    public static void selectionSort(int[] array, int n){
        
    }
}

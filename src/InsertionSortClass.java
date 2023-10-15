import java.util.Arrays;

public class InsertionSortClass {
    public static void main(int[] array){
        System.out.println("\nInsertion sort");

        // find length of array and set it to n
        int n = array.length; // 11

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // insertion sort - O(n^2)
        insertionSort(array, n);

        // print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // insertion sort
    public static void insertionSort(int[] array, int n){
        
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++) {
                
            }
        }
        
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i]  = array[j];
        array[j]  = temp;
    }
}

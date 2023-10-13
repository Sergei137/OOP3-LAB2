import java.util.Arrays;

public class BubbleSortClass {
    public static void bsc(int[] array){
        System.out.println("Bubble sort");

        // find length of array and set it to n
        int n = array.length; // 11
        
        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // bubble sort
        bubbleSort(array, n);

        // print sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }

    // bubble sort method - O(n^2)
    public static void bubbleSort(int[] array, int n){

        // bubble sort code
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

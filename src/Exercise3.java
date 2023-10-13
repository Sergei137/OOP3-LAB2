import java.util.Arrays;

public class Exercise3 {
    // bubble sort method - O(n^2)
    public static void bubbleSort(int[] array){
        System.out.println("Bubble sort");
        int n = array.length; // 11

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
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

        // print sorted array
        System.out.println("\nSorted array: " + Arrays.toString(array));
    }

    // quick sort method - O(n^2)
    public static void quickSort(int[] array, int low, int high){
        System.out.println("Quick sort");
        int n = array.length; // 11
        
        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }








    }

    // insertion sort - O(n^2)
    public static void insertionSort(int[] array){
        System.out.println("Quick sort");
        int n = array.length; // 11
        
        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }






    }

    // selection sort - O(n^2)
    public static void selectionSort(int[] array){
        System.out.println("Quick sort");
        int n = array.length; // 11
        
        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }







    }
}

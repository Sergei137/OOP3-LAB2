

public class BubbleSortClass {
    public static void main(int[] array){
        System.out.println("\nBubble sort");

        // find length of array and set it to n
        int n = array.length; // n = 11
        
        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // bubble sort - O(n^2)
        bubbleSort(array, n);

        // print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // bubble sort method
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
// is this it?
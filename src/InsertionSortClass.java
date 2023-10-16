

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

    // insertion sort method
    public static void insertionSort(int[] array, int n){
        for (int i = 0; i < n; i++){
            
            // set key to array[i]
            int key = array[i];
            
            // move array elements that are greater than the key to one position ahead of their current position
            int j = i - 1;
            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }

            // insert the key into the array
            array[j + 1] = key;
        }
    }
}

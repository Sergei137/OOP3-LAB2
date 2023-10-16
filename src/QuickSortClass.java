

public class QuickSortClass {
    public static void main(int[] array){
        System.out.println("\nQuick sort");

        // find length of array and set it to n
        int n = array.length; // n = 11

        // set min and max bounds
        int  min = 0;
        int max = n - 1; // max = 10

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // quick sort - O(n^2)
        quickSort(array, min, max);

        // print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // quick sort method
    public static void quickSort(int[] array, int min, int max){
        if (min < max) {
            // partition array
            int pivotIndex = partition(array, min, max);

            // sort subarray before pivot recursively
            quickSort(array, min, pivotIndex - 1);

            // sort subarray after pivot recursively
            quickSort(array, pivotIndex + 1, max);
        }
    }

    // partition method
    public static int partition(int[] array, int min, int max){
        int pivot = array[max];
        int i = min - 1;

        // swap array[i] and array[j]
        for (int j = min; j < max; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i + 1] and array[max]
        int temp = array[i + 1];
        array[i + 1] = array[max];
        array[max] = temp;

        return i + 1;
    }
}

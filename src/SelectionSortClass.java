

public class SelectionSortClass {
    public static void main(int[] array){
        System.out.println("\nSelection sort");

        // find length of array and set it to n
        int n = array.length; // 11

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // selection sort - O(n^2)
        selectionSort(array, n);

        // print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // selection sort
    public static void selectionSort(int[] array, int n){
        for (int i = 0; i < n - 1; i++){
            int minIndex = i;

            // find the minimum element in the unsorted array
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

            // swap the minimum element with the first element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

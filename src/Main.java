import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1 - Sort students by name and age
        System.out.println("Exercise 1 - Sort students by name and age");
        Exercise1.SortStudents();

        // Exercise 2 - Binary search
        System.out.println("\nExercise 2 - Binary search");
        int sortedList[] = {1,2,3,4,5,6,7,8,9,10}; // sorted list of integers
        int key = 5; // target key
        Exercise2.BinarySearch(sortedList, key);
        
        // Exercise 3 - Sort array
        int[] array1 = {3, 8, 2, 6, 10, 1, 7, 4, 5, 9, 0};
        System.out.println("\nExercise 3 - Sort array");
        System.out.println("Select a sorting algorithm: ");
        System.out.println("1. Bubble sort");
        System.out.println("2. Quick sort");
        System.out.println("3. Insertion sort");
        System.out.println("4. Selection sort");
        System.out.print("Input: ");
        int menuInput1 = 0;
        menuInput1 = scanner.nextInt();
        switch (menuInput1) {
            case 1:
                Exercise3.BubbleSort(array1);
                break;
            case 2:
                Exercise3.QuickSort(array1);
                break;
            case 3:
                Exercise3.InsertionSort(array1);
                break;
            case 4:
                Exercise3.SelectionSort(array1);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        // end onf program
        scanner.close();
        System.out.println("Program terminated.");
    }        
}

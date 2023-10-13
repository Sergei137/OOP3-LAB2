import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    // Exercise 3 menu
    public static void ex3Menu(Scanner scanner) {

        // Set array
        int[] array1 = {3, 8, 2, 6, 10, 1, 7, 4, 5, 9, 0};

        System.out.println("\nExercise 3 - Sort array");
        System.out.println("Select a sorting algorithm: ");
        System.out.println("1. Bubble sort");
        System.out.println("2. Quick sort");
        System.out.println("3. Insertion sort");
        System.out.println("4. Selection sort");
        System.out.print("Input: ");
        int menuInput1 = 0;

        // read input
        menuInput1 = scanner.nextInt();

        // switch case menu for sorting algorithms
        switch (menuInput1) {
            case 1:
                BubbleSortClass.bsc(array1);
                break;
            case 2:
                QuickSortClass.qsc(array1);
                break;
            case 3:
                InsertionSortClass.isc(array1);
                break;
            case 4:
                SelectionSortClass.ssc(array1);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    } 
}

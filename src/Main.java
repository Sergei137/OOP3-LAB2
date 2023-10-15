import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1 - Sort students by name and age
        System.out.println("\nExercise 1 - Sort students by name and age");
        Exercise1.sortStudents();

        // Exercise 2 - Binary search
        System.out.println("\nExercise 2 - Binary search");
        int sortedList[] = {1,2,3,4,5,6,7,8,9,10}; // sorted list of integers
        int key = 5; // target key
        Exercise2.binarySearch(sortedList, key);
        
        // Exercise 3 - Sorting Algorithms
        Exercise3.ex3Menu(scanner);

        // end onf program
        scanner.close();
        System.out.println("\nProgram terminated.");
    }        
}

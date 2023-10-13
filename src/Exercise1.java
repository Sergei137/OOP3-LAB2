import java.util.Collections;
import java.util.ArrayList;

public class Exercise1 {
    public static void SortStudents() {
        
        // array list
        ArrayList<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Alice", 20));
        studentList1.add(new Student("Bob", 22));
        studentList1.add(new Student("Eve", 20));
        studentList1.add(new Student("Charlie", 18));

        // comparable
        Collections.sort(studentList1);
        System.out.println("\nSort student names (alphabetically) using comparable:");
        for (var i : studentList1) {
            System.out.println(i.toString());
        }

        // comparator
        Collections.sort(studentList1, new Student(null, 0));
        System.out.println("\nSort student ages (lowest to highest) using comparator:");
        for (var i : studentList1) {
            System.out.println(i.toString());
        }
    }
}

import java.util.Collections;
import java.util.ArrayList;

public class Exercise1 {
    public static void E1() {
        
        // array list
        ArrayList<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Alice", 20));
        studentList1.add(new Student("Charlie", 18));
        studentList1.add(new Student("Bob", 22));

        // comparable
        Collections.sort(studentList1);
        System.out.println("\nSort student names (alphabetically) using comparable:");
        for (var i: studentList1) {
            System.out.println(i.toString());
        }

        // comparator
        Collections.sort(studentList1, new Student("", 0));
        System.out.println("\nSort student ages (lowest to highest) using comparator:");
        for (var i: studentList1) {
            System.out.println(i.toString());
        }
    }
}

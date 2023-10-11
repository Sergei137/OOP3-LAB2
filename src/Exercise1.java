import java.util.Collections;
import java.util.ArrayList;

public class Exercise1 {
    public static void E1() {
        
        // array list
        ArrayList<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Alice", 20));
        studentList1.add(new Student("Charlie", 18));
        studentList1.add(new Student("Bob", 22));

        // compare by age
        StudentAgeComparator compareByAge = new StudentAgeComparator();
        Collections.sort(studentList1, compareByAge);
        for (var i: studentList1) {
            System.out.println(i.name + " " + i.age);
        }

        // var s1 = studentList2.get(0);
        // var s2 = studentList2.get(1);
        // System.out.println(s1.compareTo(s2));

        // compare by name
        StudentNameComapartor compareByName = new StudentNameComapartor();
        Collections.sort(studentList1, compareByName);
        for (var i: studentList1) {
            System.out.println(i.name + " " + i.age);
        }







        // Array
        // Student[] studentList2 = new Student[3]; 
        // studentList2[0] = new Student("Alice", 20);
        // studentList2[1] = new Student("Charlie", 18);
        // studentList2[2] = new Student("Bob", 22);
        // StudentAgeComparator.compare(studentList2[0], studentList2[1]);
    }
}

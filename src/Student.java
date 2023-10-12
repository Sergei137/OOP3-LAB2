import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    public String name;
    public int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // comparable interface for student names - compareTo()
    @Override
    public int compareTo(Student studentObj) {
        return this.name.compareTo(studentObj.getName());
    }

    // comparator interface for student ages - compare()
    @Override
    public int compare(Student studentObj1, Student studentObj2) {
        int ageComparison = Integer.compare(studentObj1.getAge(), studentObj2.getAge());
        if (ageComparison == 0) {
            return studentObj1.getName().compareTo(studentObj2.getName());
        }
        else {
            return ageComparison;
        }
    }

    // toString method for student objects
    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age;
    }
}
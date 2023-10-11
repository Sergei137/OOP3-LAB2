import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student studentObj1, Student studentObj2) {
        return studentObj1.getAge() - studentObj2.getAge();    

    }

}

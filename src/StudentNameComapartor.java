import java.util.Comparator;

public class StudentNameComapartor implements Comparator<Student>{
    @Override
    public int compare(Student studentObj1, Student studentObj2) {
        return studentObj1.getName().compareTo(studentObj2.getName());
        
    }
    
}

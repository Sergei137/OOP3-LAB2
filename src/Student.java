public class Student {
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

    











    // toString student info
    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age;
    }
}
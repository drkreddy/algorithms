package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
///lhljl
public class Streams {
    public static void main(String[] args) {

        List<Student> marvelStudents = Arrays.asList(
                new Student(1l,"spider","man",20),
                new Student(2l,"dead","pool",22),
                new Student(3l,"iron","man",24)
        );
        List<Student> dcStudents = Arrays.asList(
                new Student(1l,"super","man",30),
                new Student(2l,"bat","man",32),
                new Student(3l,"green","arraow",34)
        );
        Class marvel = new Class(marvelStudents);
        Class dc = new Class(dcStudents);
        School sc = new School(Arrays.asList(marvel,dc));

        OptionalDouble average = sc.getClasses().stream().flatMap(clss -> clss.getStudents().stream()).mapToInt(Student::getAge).average();
        average.ifPresent(System.out::print);
    }
}

class Class{
    public Class(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    List<Student> students;
}

class School {
    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    List<Class> classes;

    public School(List<Class> classes) {
        this.classes = classes;
    }
}
class Student{
    Long id;
    String firstName;
    String lastName;
    Integer age;

    public Student(Long id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

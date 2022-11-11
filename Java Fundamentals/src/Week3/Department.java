package Week3;

import java.util.ArrayList;

/**
 *A private String data field named name that defines the name of a school department. The default value is "UNKNOWN".
 * A private ArrayList<Student> data field named students that defines the list of students in a department.
 * A no-arg constructor that creates a Department object and creates an empty students list.
 * An overloaded constructor that creates a Department object with the specified name and creates an empty students list.
 * A method named setName(String name) which sets the name of a department.
 * A method named getName() which returns the name of a department.
 * A method named addStudent(Student s) which adds a student into the students list.
 * A method named toString() which returns a string representation as examples shown below.
 */

public class Department {
    private String name = "UNKNOWN";
    private ArrayList<Student> students = new ArrayList<Student>();
    public Department(){}
    public Department(String name){
        this.name = name;
    }
    public String toString(){
        return String.format("%s(number of students=%d)", name, students.size());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void addStudent(Student s){
        students.add(s);
    }
    public static void main(String[] args) {
        Student p1 = new Student("Mia", 123);
        Student p2 = new Student("Michael", 456);
        Department cs = new Department("Computer Science");
        cs.addStudent(p1); cs.addStudent(p2);
        System.out.println(cs);
        Department math = new Department();
        System.out.println(math);
    }
}

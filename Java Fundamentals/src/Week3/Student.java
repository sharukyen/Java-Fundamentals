package Week3;

/**
 *A private String data field named name that defines the name of a student. The default value is "".
 * A private int data field named studentId that defines the student id of a student. The default value is 1.
 * A no-arg constructor that creates a Student object.
 * An overloaded constructor that creates a Student object with the specified name and student id.
 * A method named toString() which returns a string representation as examples shown below.
 * A method named getName() which returns the name of a student.
 */

public class Student {
    private String name = "";
    private int studentId = 1;
    public Student(){}
    public Student(String name, int id){
        this.name = name;
        studentId = id;
    }
    public String toString(){
        return String.format("%s(%d)", name, studentId);
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        Student p1 = new Student("Paul", 373);
        System.out.println(p1);
        Student s2 = new Student();
        System.out.println(s2);
    }
}

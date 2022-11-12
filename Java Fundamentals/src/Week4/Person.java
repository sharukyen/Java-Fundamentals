package Week4;

/**
 *Define an abstract class named Person which represents a Person object. The Person class contains the following:
 *
 * A protected String field named name that defines the name of a Person object. The default value is "UNKNOWN"
 * A no-arg constructor that creates a Person object with default value.
 * An overloaded constructor that creates a Person object with the specified name.
 * A method named getName() which returns the name of a Person object
 * A method named setName(String name) which sets the name of a Person object with the specified parameter.
 * An abstract method named eat() which prints a message.
 * A method named toString() which returns a string representation of the object formatted as in the examples below. You may find the getClass().getName() useful.
 *
 * Continuing on from the previous question, define a subclass named named Student which represents a student. The Student class contains:
 *
 * A constructor that creates a Student object with the specified name.
 * An overridden method named eat() which prints "eating fried rice!"
 *
 * Continuing on from the previous question, define a subclass named CollegeStudent which represents a college student. The CollegeStudent class contains:
 *
 * A constructor that creates a CollegeStudent object with the specified name.
 * An overridden method named eat() which prints "eating Subway Sub of the Day!"
 *
 * Continuing on from the previous question, define a subclass named TertiaryStudent which represents a tertiary student. The TertiaryStudent class contains:
 *
 * A constructor that creates a TertiaryStudent object with the specified name.
 * An overridden method named eat() which prints "eating roast chicken!"
 *
 * Continuing on from the previous question, define a subclass named Employee which represents an employee. The Employee class contains:
 *
 * A constructor that creates a Employee object with the specified name.
 * An overridden method named eat() which prints "eating buffet!"
 *
 * Continuing on from the previous question, define a static method named printEatMessages(Person[] array) which takes an array of Person objects as a parameter and prints a message from each object in the parameter array as shown in the examples below.
 */

public abstract class Person {
    protected String name = "UNKNOWN";
    public Person() {}
    public Person(String n) {name = n; }
    public String getName() { return name; }
    public void setName(String n) { name = n; }
    public abstract void eat();
    public String toString() {return String.format("%s(%s)",getClass().getName(), name);}

    public static void printEatMessages(Person[] array) {
        for (Person p: array) {
            System.out.printf("%s, ", p.getName());
            p.eat();
        }

    }

    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("Michael");
        people[1] = new CollegeStudent("Paul");
        people[2] = new TertiaryStudent("Peter");
        people[3] = new Employee("Anna");
        printEatMessages(people);
    }
}

class Student extends Person {
    public Student(String n) { super(n); }
    public void eat() { System.out.println("eating fried rice!"); }
}
class TertiaryStudent extends Student {
    public TertiaryStudent(String n) { super(n); }
    public void eat() { System.out.println("eating roast chicken!"); }
}
class CollegeStudent extends Student {
    public CollegeStudent(String n) { super(n); }
    public void eat() { System.out.println("eating Subway Sub of the Day!"); }
}
class Employee extends Person {
    public Employee(String n) { super(n); }
    public void eat() { System.out.println("eating buffet!"); }
}
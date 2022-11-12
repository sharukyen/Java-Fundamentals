package Week3;

/**
 *Define a class named Person which represents a person. It contains:
 *
 * A private String data field named name that defines the name of a person. The default value is "".
 * A private int data field named age that defines the age of a person. The default value is 1.
 * A no-arg constructor that creates a Person object.
 * An overloaded constructor that creates a Peron object with the specified name and age.
 * A method named toString() which returns a string representation as examples shown below.
 *
 * A method named getName() which returns the name of a person.
 * A method named getAge() which returns the age of a person.
 * A method named setName(String name) which sets the name of a person.
 * A method named setAge(int age) which sets the age of a person. The method should only modify the age if the range is between 0 and 120.
 *
 * A method named growOlder() which increases the age of a person by 1.
 * A method named isOfLegalAge() which returns true if age >= 18, and returns false otherwise.
 *
 * A private double data field named weight that defines the weight of a person.
 * A private double data field named height that defines the height of a person.
 * An overloaded constructor that creates a Person object with the given values.
 * A method named setWeight(double weight) which sets the weight of a person.
 * A method named setHeight(double height) which sets the height of a person.
 * A method named getBodyMassIndex() which returns the BMI of a person.
 * Note: modify the toString() method to print the BMI of a person as the examples below. Print the result to 2 decimal places.
 */

public class Person {
    private int age=1;
    private String name="";
    private double weight, height;
    public Person() { }
    public Person(String name, int age) { this.name = name; this.age = age; }
    public Person(String name, int age, double weight, double height) {
        this(name, age);
        this.weight = weight;
        this.height = height;
    }
    public String toString() { return String.format("%s(%d),BMI=%.2f", name, age, getBodyMassIndex()); }
    public int getAge() { return age; }
    public String getName() { return name; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public void setAge(int age) {
        if (age >= 0 && age <= 120) this.age = age;
    }
    public void setName(String name) { this.name = name; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }
    public void growOlder() { age += 1; }
    public boolean isOfLegalAge() { return age>=18; }
    public double getBodyMassIndex() {
        return this.weight / (height * height);
    }
    public static void main(String[] args) {
        Person p2 = new Person("Jason", 15, 52.5, 1.54);
        System.out.println(p2);
    }
}

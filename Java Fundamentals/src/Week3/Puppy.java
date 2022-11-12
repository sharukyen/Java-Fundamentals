package Week3;

/**
 *Consider the Puppy class in the answer box below, add the following methods:
 *
 * An overloaded constructor which creates a puppy with the given name and age.
 * A method named toString() which returns a string representation of the object as shown in the examples below.
 * A method named equals(Object obj) which compares two puppies. The method returns true if the puppies are equal, and returns false otherwise. Two puppies are equal if they both have the same name and age.
 */

public class Puppy {
    private int puppyAge=1;
    private String puppyName;
    public Puppy(String name){
        puppyName=name;
    }
    public Puppy(String name, int age){
        puppyName=name;
        puppyAge = age;
    }
    public void setAge( int age ){
        puppyAge = age;
    }
    public int getAge( ){
        return puppyAge;
    }
    public boolean equals(Object obj) {
        return (obj instanceof Puppy) &&
                (puppyAge == ((Puppy)obj).puppyAge) && puppyName.equals(((Puppy)obj).puppyName);
    }
    public String toString() { return String.format("%s(%d)", puppyName, puppyAge); }

    public static void main(String[] args) {
        Puppy p = new Puppy("Bubble", 5);
        System.out.println(p);
        Puppy p2 = new Puppy("Sunny", 5);
        System.out.println(p2);
        Puppy p3 = new Puppy("Bubble", 5);
        System.out.println(p3);
        System.out.println(p.equals(p2));
        System.out.println(p.equals(p3));
    }
}

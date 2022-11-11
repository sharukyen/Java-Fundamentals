package Week3;

/**
 *A protected String data field named name that defines the name of an animal.
 * A protected double data field named weight that defines the weight of an animal.
 * A constructor that creates an Animal object with the given name and weight.
 * A method named toString() which returns a string representation of the object as examples shown below.
 * A method named getName() which returns the name of an animal.
 * A method named getWeight() which returns the weight of an animal.
 * A method named setName(String name) which sets the name of an animal with the specified name.
 * A method named setWeight(double weight) which sets the weight of an animal with the specified weight. Note: the method should only modify the value if the weight is > 0.
 *
 * Define a subclass named Bird which represents a bird. The Bird class contains:
 *
 * A constructor which creates a Bird object with the given name and weight.
 * Define a subclass named Dog which represents a dog. The Dog class contains:
 *
 * A constructor which creates a Dog object with the given name and weight.
 */

public class Animal {
    protected String name;
    protected double weight;
    public Animal(String n, double w) {
        this.name = n;
        this.weight = w;
    }
    public String toString() { return String.format("Name=%s, weight=%.2f, type=%s", name, weight, this.getClass().getName()); }
    public String getName() { return name; }
    public void setName(String s) { name = s; }
    public double getWeight() { return weight; }
    public void setWeight(double w) { if (w>0) weight = w; }
}
class Bird extends Animal {
    public Bird(String n, double w) { super(n,w); }
}
class Dog extends Animal {
    public Dog(String n, double w) { super(n,w); }

    public static void main(String[] args) {
        Animal unknown = new Animal("bubble", 4.6);
        System.out.println(unknown);
        Animal animal = new Animal("Fluffy", 3.6);
        System.out.println(animal);
        System.out.println(unknown == animal);

        //Dog fluffy = new Dog("Fluffy", 5.2);
        //System.out.println(fluffy);
        //Bird tweety = new Bird("Tweety", 1.2);
        //System.out.println(tweety );
    }
}

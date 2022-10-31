package Composition_Inheritance;

/**
 *Let's create a program for a store. The store sells items. Each item has a description and price attributes.
 * Define a derived class named Food that inherits from the class Item and represents food in the store.
 * The Derived class Food should inherit the functionality of the super class, but also include a calories field (of type double).
 * The Food class contains the following:
 * A private double data field named calories which defines the calories of a food item. The default value is 1.
 * A constructor which takes a description and a price as parameters and creates a Food object.
 * An overloaded constructor which creates a food object with the given description, price and calories.
 * A method named toString() which returns a string representation of the object as shown in the examples below.
 */

class Item {
    protected String description;
    protected double price;
    public Item(String des, double pr) {
        description = des;
        price = pr;
    }
    public String toString() { return String.format("Item:%s($%.2f)", description, price); }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
}

class Food extends Item {
    private double calories=1;
    public Food(String des, double pr, double ca) {
        super(des, pr);
        calories = ca;
    }
    public Food(String des, double pr) {
        super(des, pr);
    }
    public String toString() { return String.format("%s,calories=%.1f",super.toString(),calories);
    }

    public static void main(String[] args) {
        Food fd = new Food("a banana", 1.5, 90);
        Food fd2 = new Food("an apple", 1);
        System.out.println(fd);System.out.println(fd2);
        System.out.println(fd.getPrice());System.out.println(fd2.getDescription());
    }
}

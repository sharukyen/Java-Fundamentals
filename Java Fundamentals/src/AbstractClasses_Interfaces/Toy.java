package AbstractClasses_Interfaces;

/**
 *Let's create a program for a store. The store sells items. Each item has a description and price attributes. Define a derived class named Toy that inherits from the class Item and represents toys in the store. The Derived class Toy should inherit the functionality of the super class, but also include a minimumAge field (of type int). Toy is taxable. A Taxable item has a taxRate of 6 percent. The Toy class should implement the Taxable interface and implement the calculateTaxAmount method. The Toy class contains the following:
 * A private int data field named minimumAge which defines the minimum age of a toy item. The default value is 3.
 * A constructor which takes a description and price as parameters and creates a toy object.
 * An overloaded constructor which creates a toy object with the given description, price and minimum age.
 * A method named toString() which returns a string representation of the object as shown in the examples below.
 * A method named calculateTaxAmount() which returns the tax amount of a toy object. The amount is calculated by the taxRate and the price of a toy object.
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
interface Taxable {
    public double taxRate = 0.06;
    public double calculateTaxAmount();
}

class Toy extends Item implements Taxable {
    private int minimumAge = 3;
    public Toy(String des, double pr, int min) {
        super(des, pr);
        minimumAge = min;
    }
    public Toy(String des, double pr) { super(des, pr); }
    public String toString() { return String.format("%s,min age=%d",super.toString(),minimumAge); }
    public double calculateTaxAmount() {
        return price * taxRate;
    }

    public static void main(String[] args) {
        Toy t1 = new Toy("Barbie I Can Be Doll", 15);
        Toy t2 = new Toy ("Disney Pixar Toy Story 4 Woody Talking", 39, 4);
        System.out.println(t1);System.out.printf("%.2f\n",t1.calculateTaxAmount());
        System.out.println(t2);System.out.printf("%.2f\n",t2.calculateTaxAmount());
        System.out.println(t1.getDescription()); System.out.println(t1.getPrice());
    }
}

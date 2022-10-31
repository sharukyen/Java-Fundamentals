package Composition_Inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *Define a class named FruitBasket which represents a fruit basket. The fruit basket contains a list of fruits. The FruitBasket class contains the following:
 * A private ArrayList<Fruit> data field named items that defines the list of fruits of a fruit basket. Remember to create an empty basket by default.
 * A method named add(Fruit f) which takes a Fruit object as a parameter and add it to the array list of fruits.
 * A method named getNumberOfFruits() which returns the number of fruits in the basket.
 * A method named toString() which returns a string representation of the object as shown in the examples below
 */

class Fruit {
    private int weight;
    private String name;

    public Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%s(%dkg)", name, weight);
    }

}
class FruitBasket {
    private List<Fruit> items = new ArrayList<Fruit>();
    public void add(Fruit f) {
        items.add(f);
    }
    public String toString() { return items.toString(); }
    public int getNumberOfFruits() { return items.size(); }
}
class Composition{
    public static void main(String[] args) {
        Fruit f1 = new Fruit("a bag of apples", 1);
        System.out.println(f1);
        System.out.println(f1.getName());
        System.out.println(f1.getWeight());
        FruitBasket basket = new FruitBasket();
        basket.add(f1);
        System.out.println(basket);
        System.out.println(basket.getNumberOfFruits());
        }
}

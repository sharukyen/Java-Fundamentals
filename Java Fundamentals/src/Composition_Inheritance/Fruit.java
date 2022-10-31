package Composition_Inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
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

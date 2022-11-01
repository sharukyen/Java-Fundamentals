package AbstractClasses_Interfaces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
class FruitNameComparer implements Comparator<Fruit> {
    public int compare(Fruit p1, Fruit p2) {
        return p1.getName().compareTo(p2.getName());
    }


    public static void main(String[] args){
    Fruit f1 = new Fruit("a bag of oranges", 2);
    Fruit f2 = new Fruit("a bag of apples", 1);
    Fruit f3 = new Fruit("a bag of bananas", 3);
    ArrayList<Fruit> fruits = new ArrayList<Fruit>();
    fruits.add(f1);
    fruits.add(f2);
    fruits.add(f3);
    Collections.sort(fruits,new FruitNameComparer());
    System.out.println(fruits);
    }
}

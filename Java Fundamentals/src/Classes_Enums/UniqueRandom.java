package Classes_Enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *Define a class named UniqueRandom that stores a list of unique random numbers. The UniqueRandom class should use the Random class to generate random numbers. You MUST set the seed to 30 in order to generate the same set of numbers with the expected output. The UniqueRandom class contains the following:
 * A private ArrayList<Integer> field named numbers that defines a list of unique random integers.
 * A constructor which takes the number of unique numbers required and the range (in the range from 0 to less than range) of the random numbers as parameters and creates an ArrayList of integers. The constructor should create the number of random unique integers required and add them into the ArrayList. Use the random.nextInt() method to generate a random integer.
 * A method named toString() method that returns a string representation of the object as in the examples below.
 */

class UniqueRandom  {
    private List<Integer> numbers;
    public UniqueRandom(int size, int range) {
        Random random = new Random(30);
        numbers = new ArrayList<Integer>();
        int count=0, num;
        while (count<size) {
            num = random.nextInt(range);
            if (! numbers.contains(num)) {
                numbers.add(num);
                count += 1;
            }
        }
    }
    public String toString() { return numbers.toString(); }
    public static void main(String[] args) {
        UniqueRandom u = new UniqueRandom(10, 100);
        System.out.println(u);
        UniqueRandom u2 = new UniqueRandom(3, 20);
        System.out.println(u2);
    }
}

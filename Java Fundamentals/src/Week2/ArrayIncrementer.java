package Week2;

import java.util.Arrays;

/**
 *The following static method takes an array of integers as a parameter and increments each element value by one.
 */

public class ArrayIncrementer {
    public static void incrementByOne(int[] numbers) {
        for (int index=0; index<numbers.length; index++)
            numbers[index] += 1;
    }
    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5};
        incrementByOne(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

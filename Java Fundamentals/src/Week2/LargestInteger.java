package Week2;

/**
 *Define a method named calculateMaxTwo(int number1, int number2) which takes two integers as parameters and returns the largest value.
 * Define a method named calculateMaxThree(int number1, int number2, int number3) which takes three integers as parameters and returns the largest value.
 */

public class LargestInteger {
    public static int calculateMaxTwo(int number1, int number2) {
        return Math.max(number1, number2);
    }
    public static int calculateMaxThree(int number1, int number2, int number3) {
        return calculateMaxTwo(calculateMaxTwo(number1, number2), number3);
    }

    public static void main(String[] args) {
        System.out.println(calculateMaxTwo(3, 4));
        System.out.println(calculateMaxThree(3, 4, 6));
    }
}

package Week2;

/**
 *The method returns the sum of all entries in the parameter array of arrays which are greater than a specified amount, target.
 */

public class ArraySumOver {
    public static int sumOver(int[][] values, int target) {
        int total = 0;
        for (int[] array: values)
            for (int number : array)
                if (number > target)
                    total += number;
        return total;
    }

    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 16, 80, 27}, {1, 4, 120, 18, 7}, {20, 14, 70, 8, 130}};
        System.out.println(sumOver(numbers, 50));
    }
}

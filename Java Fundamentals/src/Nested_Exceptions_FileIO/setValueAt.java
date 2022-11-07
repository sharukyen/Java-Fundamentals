package Nested_Exceptions_FileIO;

/**
 *Define a static method named setValueAt(int[] numbers, int index, int value) which takes an array of integers, a index value and a value as parameters.
 * The method overrides the value at the specified index position and returns true. If the index value is out of the range, the method should print "ERROR: Invalid index." and return false.
 *
 * Note: you *must* use the try... except syntax in your solution and you can assume that the array is not empty.
 */

public class setValueAt {
    public static boolean setValueAt(int[] numbers, int index, int value){
        try {
            numbers[index] = value;
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: Invalid index");
            return false;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7};
        System.out.println(setValueAt(numbers, 2, 4));
        int[] numbers1 = new int[]{1, 3, 5, 7, 9, 11, 13};
        System.out.println(setValueAt(numbers1,10, 4));
    }
}

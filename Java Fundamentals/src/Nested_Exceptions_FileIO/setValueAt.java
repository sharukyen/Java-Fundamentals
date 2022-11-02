package Nested_Exceptions_FileIO;

/**
 *
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

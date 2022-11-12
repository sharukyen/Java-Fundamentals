package Week5;

import java.util.Scanner;

/**
 *
 */

public class TestException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int[] array = {1, 2, 3};
            System.out.println("Enter an index: ");
            int index = input.nextInt();
            System.out.println("The value is " + array[index]);
        } catch (Exception ex) {
            System.out.println("ERROR: Invalid index!");}
    }
}

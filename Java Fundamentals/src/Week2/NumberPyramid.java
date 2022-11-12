package Week2;

import java.util.Scanner;

/**
 *the following program prompts the user to enter a number of rows and prints a number pattern. Note: you can assume that the number of rows will always be a single-digit positive number.
 */

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number = input.nextInt();
        for (int row = 1; row <= number; ++row){
            for (int col = 1; col <= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

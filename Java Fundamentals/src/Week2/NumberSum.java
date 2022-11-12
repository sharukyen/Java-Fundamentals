package Week2;

import java.util.Scanner;

/**
 *The following program should calculate the sum of all natural numbers from 1 to the given number using a while loop.
 */

public class NumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int result=0, i=1;
        while (i<=number) {
            result += i;
            i++;
        }
        System.out.println("Sum = " + result);
    }
}

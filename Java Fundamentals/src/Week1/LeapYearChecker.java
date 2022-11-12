package Week1;

import java.util.Scanner;

/**
 *
 */

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d is a leap year.", year);
        }
        else {
            System.out.printf("%d is not a leap year.", year);
        }
    }
}

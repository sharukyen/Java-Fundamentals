package JavaBasics;

import java.util.Scanner;

/**
 * A company uses the following rules to calculate the cost (in dollars) of buying movie tickets. The ticket prices are as follows:
 *
 * Day	Before 5pm (1700)	5pm and later (1700+)
 * Mon	$11	                $15
 * Tues	$8	                $9
 * Wed-Fri	$12	            $13
 * Weekend  $16	            $17
 *
 * Write a program that prompts the user to enter the day, the time and the number of tickets. Your program should then print the total cost to buy those tickets.
 * To simplify your program, a number will be used to represent each day (Mon=1, Tues=2, etc.). The time will be entered in standard 24 hour time as a single number (0000-2359).
 * You can assume that the user will only enter valid input (For example: an integer number within the valid range).
 */
public class TicketCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day (1-7):");
        String dayStr = input.nextLine();
        System.out.println("Enter the time (0000-2359):");
        String timeStr = input.nextLine();
        System.out.println("Enter the number of tickets:");
        String numStr = input.nextLine();
        int cost = 0;

        int day = Integer.parseInt(dayStr);
        int time = Integer.parseInt(timeStr);
        int num = Integer.parseInt(numStr);

        if (day == 1){
            if (time < 1700){
                cost = 11;
            } else {
                cost = 15;
            }
        }
        if (day == 2){
            if (time < 1700){
                cost = 8;
            } else {
                cost = 9;
            }
        }
        else if (3 <= day & day <= 5){
            if (time < 1700){
                cost = 12;
            } else {
                cost = 13;
            }
        }
        else if (6 <= day & day <= 7){
            if (time < 1700){
                cost = 16;
            } else {
                cost = 17;
            }
        }
        System.out.format("Total cost is: $" + cost * num);
    }
}

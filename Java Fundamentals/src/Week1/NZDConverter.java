package Week1;

import java.util.Scanner;

/**
 *program which prompts the user to enter an amount in NZ dollars and converts it to Australian dollars using the exchange rate: 1 NZ = $0.95 AUS. Print the result to 1 decimal place. Here is a sample run:
 */

public class NZDConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in NZ dollars:");
        double nzd = input.nextDouble();
        double aus = nzd * 0.95;
        System.out.printf("NZ $%.1f = AUS $%.1f", nzd, aus);
    }
}

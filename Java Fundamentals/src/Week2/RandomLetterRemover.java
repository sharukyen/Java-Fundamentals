package Week2;

import java.util.Random;
import java.util.Scanner;

/**
 *prompts the user to enter a first name. The program removes a random letter from the first name and prints the resulting name.
 */

public class RandomLetterRemover {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = input.next();
        int length = name.length();
        Random rand = new Random();
        int randPos = rand.nextInt(length);
        System.out.println(name.substring(0, randPos) + name.substring(randPos+1));
    }
}

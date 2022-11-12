package Week2;

import java.util.Random;
import java.util.Scanner;

/**
 *prompts the user to guess a number (from 0 to 9, inclusive). Your program should generate a number between the range.
 */

public class NumberGuesser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guessNum, randNum;
        Random rand = new Random();
        randNum = rand.nextInt(10);
        guessNum = input.nextInt();
        System.out.println("Enter your guess number (0-9):");
        if (randNum != guessNum){
            System.out.printf("You lost. My number is %d but your guess is %d.", randNum, guessNum);
        }
        else{
            System.out.println("You won.");
        }
    }
}

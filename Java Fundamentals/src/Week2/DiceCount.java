package Week2;

import java.util.Random;

/**
 *The method throws a number of dice (numberOfThrows) and counts how often the dice parameter value (diceNumber) occurs.
 */

public class DiceCount {
    public static int getDiceThrows(int numberOfThrows, int diceNumber) {
        Random rand = new Random();
        int count=0, dice=0;
        for (int i=0; i<numberOfThrows; i++) {
            dice = rand.nextInt(6)+1;
            if (dice ==diceNumber )
                count +=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getDiceThrows(50, 6));
        System.out.println(getDiceThrows(30, 2));
    }
}

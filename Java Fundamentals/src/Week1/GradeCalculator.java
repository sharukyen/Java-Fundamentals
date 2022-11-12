package Week1;
import java.util.Scanner;

/**
 *100 >= score > 90, grade is A
 * 90 >= score > 75 , grade is B
 * 75 >= score > 60, grade is C
 * score <= 60, grade is D
 */

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score: ");
        int score = input.nextInt();
        if (score <= 60)
            System.out.println('D');
        else if (score < 75)
            System.out.println('C');
        else if (score < 90)
            System.out.println('B');
        else
            System.out.println('A');
    }
}

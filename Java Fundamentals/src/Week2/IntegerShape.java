package Week2;

import java.util.Scanner;

/**
 *code which reads THREE rows of integers from the User. Enter -1 to end each row.
 */

public class IntegerShape {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num; String rows="";
        System.out.println("Enter 3 rows of digits('-1' to end each row):");
        for (int i=0; i < 3; i++) {
            num = input.nextInt();
            while (num!=-1) {
                rows = rows + num + " ";
                num = input.nextInt();
            }
            rows += "\n";
        }
        System.out.println("\nRows of digits\n" + rows);
    }
}

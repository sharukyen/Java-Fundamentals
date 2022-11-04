package JavaBasics;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a numeric rainfall (which measures recent rainfall in some unspecified units) and a string material. The program prints a string "Low", "Medium" or "High" according to the following table.
 *
 *                  |Rainfall is under 20|Rainfall is 20 or over
 * Material is Grass|High	             |Medium
 * Material is Wood	|Medium	             |Low
 *
 * Note: You can assume that the material is either "Wood" or "Grass" and the number is non-negative.
 */
public class FireRisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rainfall:");
        double rain = input.nextDouble();
        System.out.println("Enter the material:");
        String material = input.next();
        if (rain >= 20 && material.equals("Wood")) {
            System.out.println("Fire risk is in low level");
        }
        else if (rain < 20 && material.equals("Grass")){
            System.out.println("Fire risk is in high level");
        }
        else if (rain >= 20 && material.equals("Grass")){
            System.out.println("Fire risk is in medium level");
        }
        else if (rain < 20 && material.equals("Wood")){
            System.out.println("Fire risk is in medium level");
        }
    }

}

package JavaBasics;

import java.util.Scanner;
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

package JavaBasics;

import java.util.Scanner;
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

package Classes_Enums;
/*
Define an enum named Month which represents the month of a year. The enum contains

A public int constant field named JAN which represents January and the number of days in January is 31.
A public int constant field named FEB which represents February and the number of days in February is 28.
A public int constant field named MAR which represents March and the number of days in March is 31.
A private int field named numberOfDays which represents the number of days in a month.
private constructor which takes an integer as a parameter and creates an enum instance.
A method named getNumberOfDays() which returns the number of days of a particular month
 */

enum Month{
    JAN(31), FEB(28), MAR(31);
    private int numberOfDays = 31;
    private Month(int n) { numberOfDays = n;}
    public int getNumberOfDays() { return numberOfDays; }


    public static void main(String[] args) {
        System.out.println(Month.JAN.getNumberOfDays());
        System.out.println(Month.FEB.getNumberOfDays());

    }
}


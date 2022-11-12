package Week5;

/**
 *Define a static nested class named MyInner which is inside the TestOuter class. The MyInner class contains:
 *
 * A static method named printMessage() which prints a message “number is XX” where XX is the number defined in the TestOuter class.
 */

public class TestOuter {
    private static int number = 30;
    public static void setNumber(int n) { number = n; }

    static class MyInner {
        public static void printMessage() {
            System.out.printf("number is %d\n", number);
        }
    }
    public static void main(String[] args) {
        TestOuter.MyInner.printMessage();
        TestOuter.setNumber(10);
        TestOuter.MyInner.printMessage();
    }
}

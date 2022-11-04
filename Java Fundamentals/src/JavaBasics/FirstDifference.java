package JavaBasics;

/**
 * Write a static method named printFirstDifference(String string1, String string2) that takes two strings as parameters and compares them character by character until a difference is found. The method prints a string showing where that difference was found. For example, the following code fragment:
 *
 * printFirstDifference("abcd" , "abde");
 * produces:
 *
 * Strings differ at position 3
 * Note:
 *
 * If the two strings are the same, the function should print "Strings are identical".
 * If one string is longer than the other one and the longer string starts with the shorter one, the function should print "Strings differ at position X" where X is the minimum string length + 1. For example, the following code fragment:
 * printFirstDifference("abc" , "abcde");
 * produces:
 *
 * Strings differ at position 4
 * You can assume that the two parameters are not empty.
 * You may find the charAt() and length() methods are helpful.
 */

public class FirstDifference {
    public static String printFirstDifference(String string1, String string2) {
        if (string1 == string2) {
            System.out.println("Strings are identical");
        } else if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) != string2.charAt(i)) {
                    System.out.printf("Strings differ at position %d", string1.indexOf(string1.charAt(i)) + 1);
                    break;
                }
            }
        } else {
            int position = Math.max(string1.length(), string2.length()) + 1 - Math.min(string1.length(), string2.length());
            System.out.printf("Strings differ at position %d", position);
        }
        return "Strings are identical";
    }

    public static void main(String[] args) {
        printFirstDifference("abcd" , "abde");
        printFirstDifference("abcdef" , "abcdef");
        printFirstDifference("hello" , "world");

    }
}

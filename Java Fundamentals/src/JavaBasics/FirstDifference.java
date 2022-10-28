package JavaBasics;

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

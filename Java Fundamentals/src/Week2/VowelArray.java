package Week2;

/**
 *a static method named startWithVowelCount(String[] words) which takes an array of strings as a parameter and returns the number of words in the array starting with a vowel. You can assume that each word in the array has at least one letter and words are in lowercase. Note: you may find the startsWith(String s) method useful.
 */

public class VowelArray {
    public static int startWithVowelCount(String[] words) {
        int count=0;
        for (String s: words) {
            if ( s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u"))
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"mobody", "goes", "to", "that", "restaurant", "because", "it", "is", "too", "crowded"};
        System.out.println(startWithVowelCount(array));
    }
}

package JavaBasics;

/**
 * Write a static method named getPigLatinify(String word) which takes a string as a parameter and returns the Pig Latin version of the word. You should convert the parameter word to lowercase characters first.
 * To convert an English word to Pig Latin word you will need to use the following rules:
 *
 * If the word starts with a consonant then the Pig Latin version is formed by moving the first letter to the end of the word and adding the string "ay", for example, turtle > urtletay
 * If the word starts with a non-consonant character then the Pig Latin version is simply the English word followed by "yay", for example, egg > eggyay and 121word > 121wordyay
 * Note:
 *
 * You may assume that the parameter contains characters and digits.
 * Consonants are defined as "bcdfghjklmnpqrstvwxyz".
 * You may find the indexOf() and substring() methods useful.
 */
public class PigLatinify {
    public static void main(String[] args) {
        System.out.println(getPigLatinify("turtle"));
        System.out.println(getPigLatinify("Egg"));

    }
    public static String getPigLatinify(String word) {
        String consonant = "bcdfghjklmnpqrstvwxyz";
        String lowerWord = word.toLowerCase();
        String firstLetter = lowerWord.substring(0, 1);
        String restWord = lowerWord.substring(1);
        if (consonant.indexOf(firstLetter) != -1)
            return restWord + firstLetter + "ay";
        else {
            return lowerWord + "yay";
        }
    }
}

package JavaBasics;

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

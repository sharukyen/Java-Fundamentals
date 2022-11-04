package Arrays_ArrayLists;


import java.util.ArrayList;
/**
 *Write a static method named get4LetterWords(String[] words) which takes an array of words as a parameter. The method returns an array list containing words which have a length of 4.
 */
public class FourLetterWords {
    public static ArrayList<String> get4LetterWords(String[] words){
        ArrayList<String> array = new ArrayList<String>();
        for (String word : words) {
            if (word.length() == 4) {
                array.add(word);
            }
        }
        return array;

    }

    public static void main(String[] args) {
        String[] original = new String[] { "void", "null", "extends", "add", "paint", "init", "append", "main" };
        ArrayList<String> a_list = get4LetterWords(original);
        System.out.println(a_list);

        String[] original2 = new String[] { "is", "a" };
        ArrayList<String> a_list2 = get4LetterWords(original2);
        System.out.println(a_list2);

    }
}

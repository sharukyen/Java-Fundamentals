package Arrays_ArrayLists;


import java.util.ArrayList;

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

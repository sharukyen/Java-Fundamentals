package Week6;

import java.util.ArrayList;
import java.util.List;

/**
 *Define a static generic method named reverse(ArrayList<T> list) which takes an array list as a parameter and returns a new array list in the reverse order of the parameter array list.
 *
 * Note: the method should return an empty list if the parameter list is an empty list. The content of the original list should not be changed by this method.
 */

public class ReverseArray {
    public static <T> ArrayList<T> reverse(List<T> list) {
        ArrayList<T> result = new ArrayList<T>();
        for (T elt : list)
            result.add(0, elt);
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("a");
        words.add("b");
        words.add("c");
        List<String> temp = reverse(words);
        System.out.println(temp);

        ArrayList<Integer> nums= new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        List<Integer> numTemp = reverse(nums);
        System.out.println(numTemp);
    }
}

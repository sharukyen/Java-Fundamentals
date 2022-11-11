package Week2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *a static method named removePositives(ArrayList<Integer> numbers) which takes an array list of integers as a parameter and removes all positive integers from the parameter array list. Note that the method make changes in place. (i.e. the method updates the parameter array list and it does not return a new array list).
 *
 * Note: you will need to remove numbers from the end of the array list.
 */

public class ArrayRemovePositives {
    public static void removePositives(ArrayList<Integer> numbers) {
        for (int i=numbers.size()-1; i>=0; i--)
            if (numbers.get(i)>0)
                numbers.remove(i);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a_list = new ArrayList<>(Arrays.asList(9, 21, 6, -34, 29, 1, -4));
        removePositives(a_list);
        System.out.println(a_list);
    }
}

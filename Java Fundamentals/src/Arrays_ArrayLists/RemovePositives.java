package Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovePositives {
    public static void removePositives(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 0) {
                numbers.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a_list = new ArrayList<>(Arrays.asList(9, 21, 6, -34, 29, 1, -4));
        removePositives(a_list);
        System.out.println(a_list);

        ArrayList<Integer> a_list2 = new ArrayList<>(Arrays.asList(1, -5));
        removePositives(a_list2);
        System.out.println(a_list2);
    }
}

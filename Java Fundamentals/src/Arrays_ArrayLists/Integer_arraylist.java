package Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 */
public class Integer_arraylist {
    public static ArrayList<Integer[]> create_arraylist(int num) {
        // 0, 0,1,, 0,1,2, 0,1,2,3
        ArrayList<Integer[]> IntList = new ArrayList<Integer[]>();
        for (int i=1; i<num+1; i++)
        {
            Integer[] data = new Integer[i];
            for (int j=0;j<i; j++) data[j] = j;
            IntList.add(data);
        }
        return IntList;
    }
    public static void main(String[] args) {
        ArrayList<Integer[]> data = create_arraylist(3);
        for (Integer[] row: data)
            System.out.println(Arrays.toString(row));
    }
}

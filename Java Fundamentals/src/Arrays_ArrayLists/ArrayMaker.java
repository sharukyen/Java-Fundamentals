package Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 Question text
 Write a static method named create_arraylist(int size) that takes an integer as a parameter and returns an array list of Integer objects arrays. (i.e. Each element is an array of Integer objects.) The number of elements in the array list is given by the parameter integer. The first element (i.e. array) contains one element. The second element contains 2 elements and so. For example: the following code fragment:

 ArrayList<Integer[]> data = create_arraylist(3);
 produces the following array list:

 [0]
 [0, 1]
 [0, 1, 2]
 Note: you can assume that the parameter integer is always > 1 and less than 10.
 */

public class ArrayMaker {
    public static ArrayList<Integer[]> create_arraylist(int num) {
        // 0, 0,1,, 0,1,2, 0,1,2,3
        ArrayList<Integer[]> res = new ArrayList<Integer[]>();
        for (int i=1; i<num+1; i++) {
            Integer[] data = new Integer[i];
            for (int j=0;j<i; j++) data[j] = j;
            res.add(data);
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer[]> data = create_arraylist(3);
        for (Integer[] row: data)
            System.out.println(Arrays.toString(row));
    }
}

package Week3;

import java.util.Arrays;

/**
 *A 3x3 matrix is represented by the following array of arrays:
 *
 * { {29, 28, 27}, {16, 15, 14}, {3, 2, 1} };
 * Define a class named MyMatrix which represents a 3x3 matrix. The MyMatrix class contains the following:
 *
 * A private int[][] data field named data that defines an array of arrays which represents a matrix.
 * A public final static int constant data field named SIZE that defines the size of the matrix. The value is 3.
 * A no-arg constructor that creates a MyMatrix object with default values.
 * An overloaded constructor which takes 9 integers as parameters and creates a MyMatrix object with the given integers.
 * An overloaded constructor which takes 3 arrays of integers as parameters and creates a MyMatrix object with the given arrays.
 * A method named toString() which returns a string representation as examples shown below. Note: you may find the StringBuffer class useful.
 *
 * define a method named add(MyMatrix element) which takes a MyMatrix object as a parameter and returns a new MyMatrix object. The method adds the two MyMatrix objects together and returns the result.
 *
 * define a method named subtract(MyMatrix element) which takes a MyMatrix object as a parameter. This method returns a MyMatrix object with the specified object subtracted from the values of this MyMatrix object.
 *
 * define a method named multiply(MyMatrix element) which takes a MyMatrix object as a parameter. This method returns a MyMatrix object multiplies the two MyMatrix objects together and returns the result. For example, consider the following code fragment:
 *
 * MyMatrix myMatrix1  = new MyMatrix(2, 5, 2, 1, 0, -2, 3, 1, 1);
 * MyMatrix myMatrix2  = new MyMatrix(-2, 1, 0, -2, 2, 1, 0, 0, 3);
 * MyMatrix result = myMatrix1.multiply(myMatrix2);
 * The first element of the first row is 2 * -2 + 5 * -2 + 2 * 0 = -14.
 * The second element of the first row is 2 * 1 + 5 * 2 + 2 * 0 = 12.
 * The third element of the first row is 2 * 0 + 5 * 1 + 2 * 3 = 11.
 *
 *define a method named scalar_multiply(int value) which takes a int as a parameter. This method refers to the product of an integer and a matrix. In scalar multiplication, each entry in the matrix is multiplied by the given scalar value. Note: the method makes changes in place and does not return anything.
 */

public class MyMatrix {
    private int[][] data;
    private final static int  SIZE=3;

    public MyMatrix() {
        data = new int[SIZE][SIZE];
    }

    public MyMatrix(int x11, int x12, int x13, int x21, int x22, int x23, int x31, int x32, int x33) {
        data = new int[][]{ {x11, x12, x13}, {x21, x22, x23}, {x31, x32, x33} };
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("");
        for (int[] row: data)
            sb.append(String.format("%s%n", Arrays.toString(row)));
        return sb.toString();
    }

    public MyMatrix add(MyMatrix other) {
        MyMatrix result = new MyMatrix();
        for (int row = 0; row < data.length; row++)
            for (int col = 0; col < data[row].length; col++)
                result.data[row][col] = data[row][col] + other.data[row][col];
        return result;
    }
    public MyMatrix subtract(MyMatrix other) {
        MyMatrix result = new MyMatrix();
        for (int row = 0; row < data.length; row++)
            for (int col = 0; col < data[row].length; col++)
                result.data[row][col] = data[row][col] - other.data[row][col];
        return result;
    }
    public MyMatrix multiply(MyMatrix other) {
        MyMatrix result = new MyMatrix();
        for (int row = 0; row < data.length; row++)
            for (int col = 0; col < data[row].length; col++)
                for (int k = 0; k < SIZE; k++) {
                    result.data[row][col] += data[row][k] * other.data[k][col];
                }
        return result;
    }
    public void scalar_multiply(int value) {
        for (int row = 0; row < data.length; row++)
            for (int col = 0; col < data[row].length; col++)
                data[row][col] *= value;
    }

    public static void main(String[] args) {
        MyMatrix myMatrix1  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(myMatrix1 );
        MyMatrix myMatrix2  = new MyMatrix();
        System.out.println(myMatrix2 );
        System.out.println(MyMatrix.SIZE);

        //MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
        //MyMatrix result = myMatrix1.add(myMatrix2);
        //System.out.println(result);

        //MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
        //MyMatrix result = myMatrix1.subtract(myMatrix2);
        //System.out.println(result);

        //MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
        //MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //MyMatrix result = myMatrix1.multiply(myMatrix2);
        //System.out.println(result);

        //MyMatrix myMatrix2  = new MyMatrix(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //MyMatrix myMatrix1  = new MyMatrix(29, 28, 27, 16, 15, 14, 3, 2, 1);
        //myMatrix1.scalar_multiply(10);
        //myMatrix2.scalar_multiply(2);
        //System.out.println(myMatrix1);
        //System.out.println(myMatrix2);
    }
}

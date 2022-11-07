package Arrays_ArrayLists;

import java.awt.*;
import java.util.ArrayList;
/**
 *Write a static method named reverse_points(ArrayList<Point> points) that takes an array list of Point objects as a parameter and reverses the x-coordinate and y-coordinate of each element in the parameter array list.
 *
 * Note: the array list is changed in-place. (i.e., the method updates the parameter array list and it doe not return a new array list). You can assume that the parameter list is not empty.
 */
public class ReversePoints {
    public static void reverse_points(ArrayList<Point> points) {
        for (Point p : points) {
            int temp = p.x;
            p.x = p.y;
            p.y = temp;
        }
    }
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(0, 10));
        points.add(new Point(10, 20));
        reverse_points(points);
        System.out.println(points);

        ArrayList<Point> points2 = new ArrayList<Point>();
        points2.add(new Point(10, 20));
        points2.add(new Point(20, 30));
        points2.add(new Point(30, 40));
        reverse_points(points2);
        System.out.println(points2);
    }
}

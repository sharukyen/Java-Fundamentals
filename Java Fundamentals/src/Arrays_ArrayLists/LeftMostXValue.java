package Arrays_ArrayLists;

import java.awt.*;

/**
 *Write a static method named getLeftMostXValue(Point[] pts) that takes an array of Point objects as a parameter and returns the smallest x coordinate value. For example, if the array contains 2 points: (150, 80) and (40, 90), then the method returns 40.
 */
public class LeftMostXValue {
    public static int getLeftMostXValue(Point[] pts) {
        int smallestSoFar = pts[0].x;
        for (int i = 1; i < pts.length; i++) {
            if (pts[i].x < smallestSoFar)
                smallestSoFar = pts[i].x;
        }
        return smallestSoFar;
    }

    public static void main(String[] args) {
        Point[] ps = new Point[5];
        ps[0] = new Point(100, 5);
        ps[1] = new Point(20, 100);
        ps[2] = new Point(140, 200);
        ps[3] = new Point(70, 100);
        ps[4] = new Point(25, 0);
        int leftX = getLeftMostXValue(ps);
        System.out.println("Smallest x value: " + leftX);

        /*Point[] ps = new Point[4];
        ps[0] = new Point(100, 5);
        ps[1] = new Point(140, 200);
        ps[2] = new Point(70, 100);
        ps[3] = new Point(25, 0);
        int leftX = getLeftMostXValue(ps);
        System.out.println("Smallest x value: " + leftX);*/

    }
}

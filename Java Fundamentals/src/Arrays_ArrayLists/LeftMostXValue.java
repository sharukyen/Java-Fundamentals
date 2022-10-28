package Arrays_ArrayLists;

import java.awt.*;

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

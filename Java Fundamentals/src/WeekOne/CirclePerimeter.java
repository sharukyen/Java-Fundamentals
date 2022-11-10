package WeekOne;

/**
 * program which prints the area and perimeter of a circle. Print the result to 2 decimal places.
 */

public class CirclePerimeter {

    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);
        System.out.printf("Perimeter is = %.2f\n", perimeter);
        System.out.printf("Area is = %.2f", area);
    }
}

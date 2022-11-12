package Week5;

/**
 * Define a subclass named Rectangle which implements the Area interface and implements the printArea(double a, double b) method. The method prints the area of a rectangle. Print the result to two decimal places.
 * Define a subclass named Circle which implements the Area interface and implements the printArea(double a, double b) method. The method prints the area of a circle. Print the result to two decimal places.
 */

public interface Area {
    void printArea(double a, double b);
}

class Rectangle implements Area {
    public void printArea(double a, double b) {
        double areaRectangle = a * b;
        System.out.printf("The area of a %s is %.2f\n", getClass().getSimpleName(), areaRectangle);
    }
}
class Circle implements Area {
    public void printArea(double a, double b) {
        double areaCircle = Math.PI * a * a;
        System.out.printf("The area of a %s is %.2f\n",getClass().getSimpleName(), areaCircle);
    }

    public static void main(String[] args) {
        Area r1 = new Rectangle();
        r1.printArea(10, 5);
        Area r2 = new Circle();
        r2.printArea(2, 2);
    }
}

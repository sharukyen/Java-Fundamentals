package AbstractClasses_Interfaces;
/**
 *The above code illustrates an abstract class Circle, which has two non-abstract derived classes, Sphere and Cylinder. Generally 2D means shapes has length, width and a base area. 3D means shapes has length, width, a base area and height. We calculate the surface area and volume based on the base area and the height.
 * Complete the two constructors of the Cylinder class. For example, the following code:
 * Cylinder c1 = new Cylinder(4); //radius is 4, height is 1
 * Cylinder c2 = new Cylinder(8, 12); //radius is 8, height is 12
 * System.out.println(c1);
 * System.out.println(c2);
 * will produce the output:
 * Cylinder,r=4.0,h=1.0
 * Cylinder,r=8.0,h=12.0
 * Complete the two constructors of the Cylinder class
 */

abstract class Circle {
    protected double radius;
    public Circle() { radius = 0; }
    public Circle(double r) { radius = r; }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public abstract double getVolume();
    public String toString() {
        return this.getClass().getName() + ",r=" + radius;
    }
}
class Sphere extends Circle {
    public Sphere() { }
    public Sphere(double r) { super(r); }
    public double getArea() { return 4 * Math.PI * radius * radius;}
    public double getVolume() { return (4.0 / 3) * Math.PI * radius * radius * radius; }
}

class Cylinder extends Circle {
    protected double height;
    public Cylinder() { }
    public Cylinder(double r) {
        super(r);
        height = 1;
    }
    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }
    public double getArea() { return 2 * Math.PI * radius * (radius + height); }
    public double getVolume() { return super.getArea() * height;  }
    public String toString() {
        return this.getClass().getName() +  ",r=" + radius + ",h=" + height;
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(3); //radius is 4, height is 1
        Cylinder c2 = new Cylinder(3, 12); //radius is 8, height is 12
        System.out.println(c1);
        System.out.println(c2);

        Cylinder c3 = new Cylinder(5); //radius is 4, height is 1
        Cylinder c4 = new Cylinder(1, 2); //radius is 8, height is 12
        System.out.println(c3);
        System.out.println(c4);
    }
}

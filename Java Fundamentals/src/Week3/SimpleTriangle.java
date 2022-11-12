package Week3;

/**
 *A private int data field named height that defines the height of a triangle. The default value is 1.
 * A private int data field named base that defines the base of a triangle. The default value is 1.
 * A no-arg constructor that creates a SimpleTriangle object with default values.
 * An overloaded constructor that creates a SimpleTriangle object with the specified base and height. Note: the first parameter is for base and the second parameter is for height.
 * The accessor and mutator methods for base and height.
 * A method named toString() which returns a string representation as examples shown below.
 * A method named getArea() which returns the area of a triangle. The return type is a double
 */

public class SimpleTriangle {
    private int height = 1;
    private int base = 1;
    public SimpleTriangle(){}
    public SimpleTriangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return String.format("Triangle, area=%.2f", getArea());
    }
    public int getHeight(){
        return this.height;
    }
    public int getBase(){
        return this.base;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setBase(int base){
        this.base = base;
    }
    public double getArea(){

        return 0.5 * (double) getHeight() * (double) getBase();
    }
    public static void main(String[] args) {
        SimpleTriangle p = new SimpleTriangle();
        System.out.println(p);
        SimpleTriangle p2 = new SimpleTriangle(10, 5);
        System.out.println(p2.getBase());
        System.out.println(p2.getHeight());
        System.out.println(p2);
        System.out.println(p == p2);
        System.out.println(p.equals(p2));
        p.setBase(50);
        p.setHeight(100);
        System.out.println(p.getBase());
        System.out.println(p.getHeight());
    }
}

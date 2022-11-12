package Week5;

/**
 * Define a class named Person which implements the above Cowboy and Drawable interfaces.
 *
 * The burp() method prints "BURP !!"
 * The drink() method prints "I'm drinking..."
 * The draw() method prints "I'm drawing my gun"
 * The draw(x,y) method prints "I'm drawing a point at (x, y)" where x is the first parameter and y is the second parameter.
 */
public interface Cowboy {
    void draw();  // draw the gun - get ready to pump some iron
    void drink(); // enjoy some beverage
    void burp();  // communicate with other people in the bar (or where ever)
}

interface Drawable {
    void draw(int x, int y);  // draw the drawable item on the screen
}

class Person implements Drawable, Cowboy {
    public void burp() { System.out.println("BURP !!"); }
    public void drink() { System.out.println("I'm drinking..."); }
    public void draw() { System.out.println("I'm drawing my gun"); }
    public void draw(int x, int y) { System.out.printf("I'm drawing a point at (%d, %d)\n", x, y); }

    public static void main(String[] args) {
        Person billyBob = new Person();
        billyBob.burp();
        billyBob.drink();
        billyBob.draw();
        billyBob.draw(10,20);
    }
}
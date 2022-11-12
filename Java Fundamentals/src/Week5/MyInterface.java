package Week5;

/**
 * Complete the create() method contains an anonymous class definition and creation. You should do the following:
 *
 * Create an instance of the anonymous class. The name of the object is "p1".
 * Define the anonymous class which implements the MyInterface interface and implements the getMessage() method which defined in MyInterface. The method prints "Implementing getMessage".
 */
public interface MyInterface {
    public String getMessage();
}

class AnonymousDemo {
    public void create() {
        MyInterface p1 = new MyInterface() {
            public String getMessage() {
                return String.format("Implementing getMessage");
            }
        };

        System.out.println(p1.getMessage());
    }

    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.create();
    }
}

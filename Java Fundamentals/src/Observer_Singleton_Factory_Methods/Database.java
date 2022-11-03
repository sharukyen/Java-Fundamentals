package Observer_Singleton_Factory_Methods;

/**
 *Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
 *
 * Define a class named Database which models a database connection. The Database class contains the following:
 * A private static String data field named filename which defines the filename of a database connection.
 * A private static Database data field named instance which defines the single instance of a database connection.
 * A private constructor which takes a filename as a parameter and sets up the filename. The constructor should print the filename as shown in the examples below.
 * A method named executeQuery(String query) method which takes a query string as a parameter and prints both the filename and query as shown in the examples below.
 * A static method named getInstance(String filename) which takes a filename as a parameter and returns only one instance of the class.
 * If it is the first time to call this method, the method creates a new object of the class. However, if the database object is not null, the method returns the existing database object instead of instantiating the class again.
 */

public class Database {
    private static Database instance = null;
    private static String filename;
    private Database(String filename) {
        this.filename = filename;
        System.out.println("Create a connection to " + filename);
    }
    public static Database getInstance(String filename) {
        if (instance == null)
            instance = new Database(filename);
        return instance;
    }
    public void executeQuery(String query) {
        System.out.printf("Execute %s from the %s database\n", query, filename);
    }
    public static void main(String[] args) {
        Database s1 = Database.getInstance("my_database.accdb");
        Database s2 = Database.getInstance("sample.accdb");
        s1.executeQuery("SELECT * from Students");
        s2.executeQuery("SELECT * from Products");
        System.out.println( s1 == s2 );
    }
}

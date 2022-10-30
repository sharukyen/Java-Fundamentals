package Classes_Enums;
import java.time.LocalTime;
import java.time.Duration;
/**
 Define a class named DemoCall which represents a call to demonstrators in the computer lab. The DemoCall class contains the following:
 A private LocalTime data field named startTime that stores the time at which the call is made (hours, using 24 hour time, and minutes),
 A private string data field named login for the login name of the student who made the call.
 A private boolean data field named isProcessed that indicates if the call is processed by a demonstrator. The default value is false.
 A private long data field name responseMinutes that indicates the response time in minutes.
 A constructor that takes a string as a parameter and creates an object with the specified time and login. You can assume that the time string is in the required valid format.
 A method named getResponseMinutes() which returns the response minutes of a call.
 A method named toString() that returns a string describing the object as in the examples below.
 A method named callProcessed(String endTimeString) which takes a String object at which the call is processed.
 The response time in minutes is calculated.
 The method converts the parameter string to a LocalTime object using the LocalTime.parse() method and uses
 "Duration.between(startTime, endTime).toMinutes()" to calculate the total number of mintues for the call.
 */
public class DemoCall {
    private LocalTime startTime;
    private long responseMinutes;
    private String login;
    private boolean isProcessed = false;

    public DemoCall(String timeString, String log) {
        startTime = LocalTime.parse(timeString);
        login = log;
    }
    public long getResponseMinutes() { return responseMinutes; }
    public String toString() {
        return isProcessed? String.format("%s %s RESPONSE %d MINUTES", login, startTime.toString(), responseMinutes) : String.format("%s %s NOT PROCESSED", login, startTime.toString());
    }
    public void callProcessed(String endTimeString) {
        LocalTime endTime = LocalTime.parse(endTimeString);
        responseMinutes = Duration.between(startTime, endTime).toMinutes();
        isProcessed = true;
    }

    public static void main(String[] args) {
        DemoCall d1 = new DemoCall("13:30", "afer010");
        System.out.println(d1);
        d1.callProcessed("14:20");
        System.out.println(d1);
        System.out.println(d1.getResponseMinutes());
    }
}

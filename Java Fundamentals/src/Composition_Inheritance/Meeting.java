package Composition_Inheritance;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *Define a class called Meeting which stores information about meetings. The meeting has a date (type of LocalDate), place (type of String), and a list of people who will attend the meeting (type of Person).
 * The instance variable names are meetingDate, meetingPlace and people. The meeting class has a static member: numberOfMeetings to keep track of the number of meeting created.
 * The class must have the following functionality:
 * Create a meeting by a date and a place. You may find the LocalDate.parse() useful. You can assume that the parameter date is valid. For example:
 * Meeting m1 = new Meeting("2020-02-12", "303S.G91");
 * Return a string representing information about the meeting. For example: the code: print(m1)
 * would produce the output:
 * The meeting is scheduled on 2020-02-12 at 303S.G91 and with [Dick Smith, Michael Hill].
 * The class should also provide functionality to add people into the meeting. For example:
 * m1.addPersonToMeeting(p1);
 * m1.addPersonToMeeting(p2);
 * The class should also provide functionality to get the number of people in the meeting, the meeting date, the meeting place.
 * For example, the code: System.out.println(m1.getNumberOfPeopleInMeeting())
 * would produce the output:
 * 2
 */
class Person {
    private String firstName;
    private String lastName;
    public Person(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }
    public String getFirstName() {return firstName; }
    public String getLastName() {return lastName; }
    public String toString() { return String.format("%s %s", firstName, lastName);}
}

public class Meeting {
    private LocalDate meetingDate;
    private String meetingPlace;
    private ArrayList<Person> people;
    public static int numberOfMeetings = 0;

    public Meeting(String dateOfMeeting, String place) {
        meetingDate = LocalDate.parse(dateOfMeeting); //"2020-11-25"
        meetingPlace = place;
        numberOfMeetings += 1;
        people = new ArrayList<Person>();
    }
    public void addPersonToMeeting(Person p) {
        people.add(p);
    }
/*	public String getMeetingPlace() { return meetingPlace; }
	public String getMeetingDate() { return meetingDate.toString(); }
	public int getMeetingDateByYear() { return meetingDate.getYear(); }
	public String getMeetingDateByMonth() { return meetingDate.getMonth().toString(); }
	public int getMeetingDateByDay() { return meetingDate.getDayOfMonth(); } */

    public int getNumberOfPeopleInMeeting() { return people.size(); }
    public String toString() {
        if (people.size() == 0)
            return String.format("The meeting is scheduled on %s at %s.", meetingDate, meetingPlace);
        else
            return String.format("The meeting is scheduled on %s at %s and with %s.", meetingDate, meetingPlace, people.toString());
    }

    public static void main(String[] args) {
        Meeting m1 = new Meeting("2020-02-12", "303S.G91");
        Meeting m2 = new Meeting("2020-08-12", "303S.G91");
        System.out.println(Meeting.numberOfMeetings);
        System.out.println(m1.getNumberOfPeopleInMeeting());
        System.out.println(m1);
        System.out.println(m2);

        Person p1 = new Person("Dick", "Smith");
        Person p2 = new Person("Michael", "Hill");
        Meeting m3 = new Meeting("2020-02-12", "303S.G91");
        m3.addPersonToMeeting(p1);
        m3.addPersonToMeeting(p2);
        Meeting m4 = new Meeting("2020-03-12", "303S.G91");
        System.out.println(m3);
        System.out.println(m4);
    }
}

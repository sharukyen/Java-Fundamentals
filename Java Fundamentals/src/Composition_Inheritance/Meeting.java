package Composition_Inheritance;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
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

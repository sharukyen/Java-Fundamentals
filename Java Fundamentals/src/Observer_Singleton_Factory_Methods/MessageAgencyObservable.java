package Observer_Singleton_Factory_Methods;

import java.util.Observable;
import java.util.Observer;

/**
 *The Observer defines a one-to-many relationship so that when one object changes state, the others are notified and updated automatically. Note: you should use the Observable class and Observer interface given from the java.util package.
 *
 * Define a class named MessageAgencyObservable which represents the Subject class in the observer design pattern. The MessageAgencyObservable class extends the Observable class and contains the following:
 *
 * A method named setMessage(String message) which takes a message as a parameter. The method sets the changed boolean and notifies all observers with the given message.
 *
 * Starting with your solution to the previous task, define a class named MessageChannelObserver which represents an observer in the observer design pattern. The MessageChannelObserver class implements the Observer interface and contains the following:
 *
 * A method named update(Observable o, Object message) which takes an observable and a message as parameters. The method prints the message as shown in the examples below.
 */

public class MessageAgencyObservable extends Observable {
    public void setMessage(String message) {
        setChanged();
        notifyObservers(message);
    }

}

class MessageChannelObserver implements Observer {
    @Override
    public void update(Observable o, Object message) {
        System.out.println("MessageChannel:" + message);
    }
}

class messageTests{
    public static void main(String[] args) {
        MessageAgencyObservable observable  = new MessageAgencyObservable();
        MessageChannelObserver observer1 = new MessageChannelObserver();
        MessageChannelObserver observer2 = new MessageChannelObserver(); observable.addObserver(observer2);
        MessageChannelObserver observer3 = new MessageChannelObserver(); observable.addObserver(observer3);
        observable.setMessage("Hello World");

        MessageAgencyObservable observable1  = new MessageAgencyObservable();
        MessageChannelObserver observer4 = new MessageChannelObserver();
        observable1.addObserver(observer4);
        observable1.setMessage("Hello world");
    }
}

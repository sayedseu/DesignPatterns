package behavioural.iterator;

/*
Iterator pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.
 */

public class IteratorDesignPattern {

    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotification();
    }
}

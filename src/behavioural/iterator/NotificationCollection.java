package behavioural.iterator;

public class NotificationCollection implements Collection {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final Notification[] notifications;

    public NotificationCollection() {
        this.notifications = new Notification[MAX_ITEMS];
        add(new Notification("Notification 1"));
        add(new Notification("Notification 2"));
        add(new Notification("Notification 3"));
        add(new Notification("Notification 4"));
    }

    void add(Notification notification) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Full");
        } else {
            notifications[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}

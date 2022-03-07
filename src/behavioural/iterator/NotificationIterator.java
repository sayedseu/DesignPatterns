package behavioural.iterator;

public class NotificationIterator implements Iterator{
    private int position = 0;
    private final Notification[] notifications;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return position < notifications.length &&
                notifications[position] != null;
    }

    @Override
    public Object next() {
        Notification notification = notifications[position];
        position = position + 1;
        return notification;
    }
}

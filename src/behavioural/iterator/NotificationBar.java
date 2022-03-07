package behavioural.iterator;

public class NotificationBar {
    private final NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    void printNotification(){
        Iterator iterator = notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext())
        {
            Notification notification = (Notification)iterator.next();
            System.out.println(notification.getMessage());
        }
    }
}

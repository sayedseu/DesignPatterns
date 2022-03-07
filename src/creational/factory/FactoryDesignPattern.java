package creational.factory;

public class FactoryDesignPattern {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification smsNotification = notificationFactory.crateNotification("SMS");
        Notification pushNotification = notificationFactory.crateNotification("PUSH");
        smsNotification.sendNotification();
        pushNotification.sendNotification();
    }
}

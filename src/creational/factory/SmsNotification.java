package creational.factory;

public class SmsNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sms notification sent");
    }
}

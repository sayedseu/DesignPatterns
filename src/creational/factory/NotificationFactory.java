package creational.factory;

public class NotificationFactory {

    Notification crateNotification(String notificationType){
        if (notificationType == null || notificationType.isEmpty()){
            return null;
        }else if (notificationType.equalsIgnoreCase("SMS")){
            return new SmsNotification();
        }else if (notificationType.equalsIgnoreCase("PUSH")){
            return new PushNotification();
        }
        return null;
    }
}

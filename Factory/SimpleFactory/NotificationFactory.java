package DesignPattern.Factory.SimpleFactory;

public class NotificationFactory {
    public Notifications createNotification(String channel){
        if (channel==null || channel.isEmpty())
            return null;
        switch (channel){
            case "SMS":
                return new SMSNotification();
            case "MAIL":
                return  new mailNotification();

            default:
                return new PushNotification();
        }
    }
}

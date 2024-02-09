package DesignPattern.Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        Notifications notifications=notificationFactory.createNotification("EMAIL");
        notifications.notifyUser();
    }
}

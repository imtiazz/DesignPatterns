package DesignPattern.Factory.SimpleFactory;

public class PushNotification implements Notifications{
    @Override
    public void notifyUser() {
        System.out.println("This is push notification");
    }
}

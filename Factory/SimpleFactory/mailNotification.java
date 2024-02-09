package DesignPattern.Factory.SimpleFactory;

public class mailNotification implements Notifications {
    @Override
    public void notifyUser() {
        System.out.println("This is mail notification");

    }
}

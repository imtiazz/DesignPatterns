package DesignPattern.Factory.SimpleFactory;

public class SMSNotification implements  Notifications{
    @Override
    public void notifyUser() {
        System.out.println("This is SMS notification");
    }
}

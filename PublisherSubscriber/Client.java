package DesignPattern.PublisherSubscriber;

public class Client {
    public static void main(String[] args) {
        Amazon amazon=Amazon.getInstance();
        SCMUser scmUser=new SCMUser(amazon);
        AppUsers appUsers=new AppUsers(amazon);
        /*
        Why to register below while creating the scmUser/appUer object, it can be initialised
         */
//        amazon.registerSubscriber(scmUser);
//        amazon.registerSubscriber(appUsers);
        amazon.orderPlace();
    }





}

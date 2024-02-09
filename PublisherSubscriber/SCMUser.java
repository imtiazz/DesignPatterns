package DesignPattern.PublisherSubscriber;

public class SCMUser implements  OrderPlacedSubscriber{
    public  SCMUser(Amazon a){
        a.registerSubscriber(this);


    }
    @Override
    public ReturnData notifyUser() {
        ReturnData returnData=new ReturnData("SCM user notified");
        System.out.println("SCM user notified");
        return returnData;
    }
}

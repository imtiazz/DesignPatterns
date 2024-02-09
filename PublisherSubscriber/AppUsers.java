package DesignPattern.PublisherSubscriber;

import javax.sound.midi.Soundbank;

public class AppUsers implements  OrderPlacedSubscriber{
    AppUsers(Amazon a){
        a.registerSubscriber(this);
    }
    @Override
    public ReturnData notifyUser() {
        ReturnData returnData=new ReturnData("App users notified");
        System.out.println("App user notified");
        return returnData;
    }
}

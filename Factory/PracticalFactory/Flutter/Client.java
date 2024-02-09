package DesignPattern.Factory.PracticalFactory.Flutter;

import DesignPattern.Factory.PracticalFactory.Flutter.Component.Button.Button;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.DropDown.DropDown;

public class Client {
    public static void main(String[] args) {
        Flutter f=new Flutter(SupportedPlatform.ANDROID);
        UIFactory factory= f.createFactory();
        Button button=factory.createButton();
        DropDown dropDown=factory.createDropDown();


    }
}

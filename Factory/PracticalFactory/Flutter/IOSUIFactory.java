package DesignPattern.Factory.PracticalFactory.Flutter;

import DesignPattern.Factory.PracticalFactory.Flutter.Component.Button.Button;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.Button.IOSButton;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.DropDown.DropDown;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.DropDown.IOSDropDown;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}

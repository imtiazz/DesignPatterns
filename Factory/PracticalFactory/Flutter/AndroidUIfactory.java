package DesignPattern.Factory.PracticalFactory.Flutter;

import DesignPattern.Factory.PracticalFactory.Flutter.Component.Button.AndroidButton;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.Button.Button;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.DropDown.AndroidDropDown;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.DropDown.DropDown;

public class AndroidUIfactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}

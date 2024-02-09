package DesignPattern.Factory.PracticalFactory.Flutter;

import DesignPattern.Factory.PracticalFactory.Flutter.Component.Button.Button;
import DesignPattern.Factory.PracticalFactory.Flutter.Component.DropDown.DropDown;

public interface UIFactory {
    public Button createButton();
    public DropDown createDropDown();

}

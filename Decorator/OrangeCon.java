package DesignPattern.Decorator;
//act as base only
public class OrangeCon implements  IceCream {
    public OrangeCon(){}

    @Override
    public String getDescription() {
        return "Orange con +";
    }

    @Override
    public int getCost() {
        return 50;
    }
}

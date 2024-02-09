package DesignPattern.Decorator;

public class Chocochips implements  IceCream{
    IceCream iceCream;

    public  Chocochips(IceCream iceCream){
        this.iceCream=iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost()+10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+"ChocoChips";
    }
}

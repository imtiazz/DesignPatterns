package DesignPattern.Decorator;

//act as both base and as adding
public class VanillaScoop implements  IceCream{

    IceCream iceCream;

    public VanillaScoop(){}
    public  VanillaScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public String getDescription() {
        if (iceCream==null){
            return "Vanilla scoops + ";
        }
        return iceCream.getDescription()+" Vanilla scoops + ";
    }

    @Override
    public int getCost() {
        if (iceCream==null){
            return  20;
        }
        return  iceCream.getCost()+20;
    }
}

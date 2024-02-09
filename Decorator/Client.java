package DesignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream=new Chocochips(
                new VanillaScoop(
                        new OrangeCon()
                )
        );

        //Error will be displayed for below code as base constructor has no arguments and it will come at last and execute first
//        IceCream iceCream=new Chocochips(
//                new OrangeCon(
//                        new VanillaScoop()
//                )
//        );
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}

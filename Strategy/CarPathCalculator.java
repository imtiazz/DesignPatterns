package DesignPattern.Strategy;

public class CarPathCalculator implements PathCalculator{

    @Override
    public void calculatePath(String source,String destination) {
        System.out.println("calculating path for car");
    }
}

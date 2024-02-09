package DesignPattern.Strategy;

public class WalkPathCalculator implements  PathCalculator{
    @Override
    public void calculatePath(String source,String destination) {
        System.out.println("Calculating path while walking");
    }
}

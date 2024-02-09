package DesignPattern.Strategy;

public class Client {
    public static void main(String[] args) {
        PathCalculator ps=PathStrategy.getStrategy("Bike");
        ps.calculatePath("Rampur","Howrah");


    }
}

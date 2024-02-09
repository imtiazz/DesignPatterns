package DesignPattern.Strategy;

public class BikePathCalculator implements  PathCalculator{
    private static BikePathCalculator instance; //if this variable is not made static, it won't be
    // accessible in  static getInstance block.
    private  BikePathCalculator(){
    }
    public static BikePathCalculator  getInstance(){
        if (instance==null){
            instance= new BikePathCalculator();
        }
        return  instance;
    }


    @Override
    public void calculatePath(String source,String destination) {
        System.out.println("Calculating path for the Bike");
    }
}

package DesignPattern.Strategy;

//import java.lang.runtime.SwitchBootstraps;

public class PathStrategy {
//    private String mode;
//    PathStrategy(String mode){
//        this.mode=mode;
//    }
    public static  PathCalculator getStrategy(String mode){
        return switch (mode){
            case "walk"-> new WalkPathCalculator();
            case "car" -> new CarPathCalculator();
            case "Bike"-> BikePathCalculator.getInstance();
            default -> null;

        };
    }

}

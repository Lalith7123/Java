package design_patterns.behavioural.strategy;

public class ByWalk implements Map{

    public void showRoute(String source, String destination){
        System.out.println("showing route from " + source + " to " + destination + " by Walk!");
    }
}

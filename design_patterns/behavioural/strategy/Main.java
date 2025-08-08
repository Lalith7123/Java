package design_patterns.behavioural.strategy;

public class Main {

    public static void main(String[] args) {

        Map byWalk = new ByWalk();
        Map byCar = new ByCar();
        Map byGovtBus = new ByGovtBus();

        MapStrategy mapStrategy = new MapStrategy();
        mapStrategy.showRoute("Chennai", "Mumbai");

        mapStrategy.setMap(byCar);
        mapStrategy.showRoute("Chennai", "Mumbai");

    }
}

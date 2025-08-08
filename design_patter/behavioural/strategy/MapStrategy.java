package design_patterns.behavioural.strategy;

public class MapStrategy implements Map{

    private Map map;

    public MapStrategy(){
        this.map = new ByWalk();
    }

    public void setMap(Map map){
        this.map = map;
    }

    public void showRoute(String source, String destination){
        this.map.showRoute(source, destination);
    }


}

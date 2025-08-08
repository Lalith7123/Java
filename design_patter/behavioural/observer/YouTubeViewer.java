package design_patterns.behavioural.observer;

public class YouTubeViewer implements Subscriber{

    private final String name;

    public YouTubeViewer(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println(name + " " + message + " received!");
    }


}

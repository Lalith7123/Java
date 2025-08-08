package design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel{

    private final String channelName;
    private final List<Subscriber> subscriberList = new ArrayList<>();

    public YouTubeChannel(String channelName){
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber){
        this.subscriberList.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber){
        this.subscriberList.remove(subscriber);
    }

    private void notifySubscriber(String message){
        this.subscriberList.forEach(s -> s.update(message));
    }

    public void uploadVideo(String title){
        System.out.println("Channel " + channelName + " uploaded a new video with title " + title);
        notifySubscriber("Channel " + channelName + " uploaded a new video with title " + title);
    }

}

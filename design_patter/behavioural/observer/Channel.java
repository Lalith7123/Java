package design_patterns.behavioural.observer;

public interface Channel {

    void uploadVideo(String title);
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);


}

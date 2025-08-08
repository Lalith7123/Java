package design_patterns.behavioural.observer;

public class Main {

    public static void main(String[] args) {

        YouTubeChannel youTubeChannel = new YouTubeChannel("Chandra Recipe");

        YouTubeViewer youTubeViewer1 = new YouTubeViewer("Lalith");
        YouTubeViewer youTubeViewer2 = new YouTubeViewer("Rajan");
        YouTubeViewer youTubeViewer3 = new YouTubeViewer("Hemanth");
        YouTubeViewer youTubeViewer4 = new YouTubeViewer("Chandra");

        youTubeChannel.subscribe(youTubeViewer1);
        youTubeChannel.subscribe(youTubeViewer2);
        youTubeChannel.subscribe(youTubeViewer3);
        youTubeChannel.subscribe(youTubeViewer4);
        youTubeChannel.unSubscribe(youTubeViewer4);
        youTubeChannel.uploadVideo("kari kulambu!");

    }
}

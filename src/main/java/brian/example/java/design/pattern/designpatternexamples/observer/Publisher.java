package brian.example.java.design.pattern.designpatternexamples.observer;

public interface Publisher {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
    void addVideo(String newVideo);
    String getTitle();
    String getVideo();
}

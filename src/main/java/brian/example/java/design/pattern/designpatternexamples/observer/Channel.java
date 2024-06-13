package brian.example.java.design.pattern.designpatternexamples.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Publisher {

    List<Observer> observers = new ArrayList<>();

    private final String title;
    private String videoTitle;

    public Channel(String title){
        this.title = title;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    public String getTitle(){
        return this.title;
    }

    public void addVideo(String newVideo){
        this.videoTitle = newVideo;
        notifyObserver();
    }

    public String getVideo(){
        return this.videoTitle;
    }
}

package brian.example.java.design.pattern.designpatternexamples.observer;

public interface Observer {

    void subscribeTo(Publisher publisher);
    void unsubscribeFrom(Publisher publisher);
    void update();
}

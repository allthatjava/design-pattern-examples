package brian.example.java.design.pattern.designpatternexamples.observer;

public class SubscriberTwo implements Observer{

    private final String name;
    private Publisher publisher;

    private static int observerIDTracker;
    private final int observerId;

    public SubscriberTwo(String name){
        this.name = name;
        this.observerId = ++observerIDTracker;
    }

    public void subscribeTo(Publisher publisher){
        System.out.println("New subscriber ["+observerId+"]:"+name );
        this.publisher = publisher;
        this.publisher.register(this);
    }

    public void unsubscribeFrom(Publisher publisher){
        publisher.unregister(this);
    }

    @Override
    public void update() {
        System.out.println("SubscriberTwo ID:["+observerId+"]:"+name );
        System.out.println("Hello "+this.name+" new video: "+ publisher.getVideo()+" has been added from "+ publisher.getTitle());
    }
}

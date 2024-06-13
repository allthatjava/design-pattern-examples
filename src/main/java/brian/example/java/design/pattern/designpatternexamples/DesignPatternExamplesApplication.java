package brian.example.java.design.pattern.designpatternexamples;

import brian.example.java.design.pattern.designpatternexamples.decorator.BaconStrip;
import brian.example.java.design.pattern.designpatternexamples.decorator.Pepperoni;
import brian.example.java.design.pattern.designpatternexamples.decorator.Pizza;
import brian.example.java.design.pattern.designpatternexamples.decorator.PlainPizza;
import brian.example.java.design.pattern.designpatternexamples.factory.Ship;
import brian.example.java.design.pattern.designpatternexamples.factory.ShipFactory;
import brian.example.java.design.pattern.designpatternexamples.observer.*;
import brian.example.java.design.pattern.designpatternexamples.singleton.Singleton;
import brian.example.java.design.pattern.designpatternexamples.strategy.Animal;
import brian.example.java.design.pattern.designpatternexamples.strategy.Bird;
import brian.example.java.design.pattern.designpatternexamples.strategy.Dog;
import brian.example.java.design.pattern.designpatternexamples.strategy.pattern.Flys;

public class DesignPatternExamplesApplication {

    public static void main(String[] args) {

        // Decorator Pattern
        System.out.println("Decorator Pattern ========== ");
        Pizza pizza = new BaconStrip(new Pepperoni(new PlainPizza()));
        System.out.println("Pizza has "+pizza.getDescription());
        System.out.println("Pizza cost "+pizza.getCost());

        // Strategy Pattern
        System.out.println("Strategy Pattern ========== ");
        Animal dog = new Dog();
        Animal bird = new Bird();
        System.out.println("Dog:"+dog.fly());
        System.out.println("Bird:"+bird.fly());

        dog.setFlyable(new Flys());
        System.out.println("After switching the strategy...");
        System.out.println("Dog:"+dog.fly());

        // Factory Pattern
        System.out.println("Factory Pattern ========== ");
        Ship ship1 = ShipFactory.getShip("B");
        ship1.movingForward();
        Ship ship2 = ShipFactory.getShip("S");
        ship2.movingForward();

        // Observer Pattern - Two Publisher(with 4 Subscribers and with 2 subscribers)
        System.out.println("Observer Pattern ========== ");
        Publisher chABC = new Channel("ABC");
        Publisher chDEF = new Channel("DEF");
        Observer sub = new SubscriberOne("Brian");
        Observer sub2 = new SubscriberOne("Tom");
        Observer sub3 = new SubscriberTwo("Brian2");
        Observer sub4 = new SubscriberTwo("Tom2");
        Observer sub5 = new SubscriberOne("Brian");
        Observer sub6 = new SubscriberOne("Tom");
        sub.subscribeTo(chABC);
        sub2.subscribeTo(chABC);
        sub3.subscribeTo(chABC);
        sub4.subscribeTo(chABC);
        sub5.subscribeTo(chDEF);
        sub6.subscribeTo(chDEF);

        chABC.addVideo("New Video");
        chABC.addVideo("New Video2");
        chDEF.addVideo("New VideoA");

        // Singleton Pattern
        System.out.println("Singleton Pattern ========= ");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.setName("Singleton 1");
        System.out.println("Singleton1:"+singleton1);
        System.out.println("Singleton2:"+singleton2);
        singleton2.setName("Singleton 2");
        System.out.println("Singleton1:"+singleton1);
        System.out.println("Singleton2:"+singleton2);
    }

}

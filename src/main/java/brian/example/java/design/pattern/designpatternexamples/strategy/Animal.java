package brian.example.java.design.pattern.designpatternexamples.strategy;

import brian.example.java.design.pattern.designpatternexamples.strategy.pattern.Flyable;

public class Animal {

    Flyable flyable;

    public String fly(){
        return flyable.fly();
    }

    public void setFlyable(Flyable flyable){
        this.flyable = flyable;
    }
}

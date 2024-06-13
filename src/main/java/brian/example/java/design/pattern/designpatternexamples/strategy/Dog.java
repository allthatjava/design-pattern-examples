package brian.example.java.design.pattern.designpatternexamples.strategy;

import brian.example.java.design.pattern.designpatternexamples.strategy.pattern.CantFly;

public class Dog extends Animal{
    public Dog(){
        flyable = new CantFly();
    }
}

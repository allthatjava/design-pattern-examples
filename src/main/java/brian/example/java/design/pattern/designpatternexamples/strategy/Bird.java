package brian.example.java.design.pattern.designpatternexamples.strategy;

import brian.example.java.design.pattern.designpatternexamples.strategy.pattern.Flys;

public class Bird extends Animal{
    public Bird(){
        flyable = new Flys();
    }
}

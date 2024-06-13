package brian.example.java.design.pattern.designpatternexamples.strategy.pattern;

public class CantFly implements Flyable{

    @Override
    public String fly() {
        return "It can't fly~~~";
    }
}
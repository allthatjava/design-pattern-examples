package brian.example.java.design.pattern.designpatternexamples.decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}

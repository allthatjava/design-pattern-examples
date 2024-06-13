package brian.example.java.design.pattern.designpatternexamples.decorator;

public class Pepperoni extends ToppingDecorator{

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizza.getDescription()+", Pepperoni";
    }

    @Override
    public double getCost(){
        return pizza.getCost()+0.50;
    }
}

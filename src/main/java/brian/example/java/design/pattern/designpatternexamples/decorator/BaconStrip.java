package brian.example.java.design.pattern.designpatternexamples.decorator;

public class BaconStrip extends ToppingDecorator{
    public BaconStrip(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() +", BaconStrip";
    }

    @Override
    public double getCost(){
        return pizza.getCost()+1.00;
    }
}

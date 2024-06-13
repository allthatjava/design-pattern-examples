package brian.example.java.design.pattern.designpatternexamples.factory;

public class ShipFactory {
    public static Ship getShip(String type){
        if("B".equals(type))
            return new BigShip();
        else if("S".equals(type))
            return new SmallShip();
        else
            return null;
    }
}

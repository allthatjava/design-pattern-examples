package brian.example.java.design.pattern.designpatternexamples.prototype;

public abstract class Vehicle{
    protected String brand;
    protected String model;
    protected String color;

    protected Vehicle(){}

    protected Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    protected Vehicle(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public abstract Vehicle copy();
}

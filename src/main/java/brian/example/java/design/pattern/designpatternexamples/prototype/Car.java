package brian.example.java.design.pattern.designpatternexamples.prototype;

public class Car extends Vehicle{
    private int topSpeed;
    private GpsSystem gpsSystem;

    public Car(){}
    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
        this.gpsSystem = new GpsSystem(car.gpsSystem.getStartingCity());
    }

    public Car(String brand, String model, String color, int topSpeed, GpsSystem gpsSystem){
        super(brand,model,color);
        this.topSpeed = topSpeed;
        this.gpsSystem = gpsSystem;
    }

    @Override
    public Car clone(){
        return new Car(this);
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public GpsSystem getGpsSystem(){
        return gpsSystem;
    }

    public String toString(){
        return "Car[brand="+this.brand+",model="+this.model+",color="+this.color+",topSpeed="+this.topSpeed
                +", gpsSystem="+ gpsSystem.toString()+"]";
    }
}

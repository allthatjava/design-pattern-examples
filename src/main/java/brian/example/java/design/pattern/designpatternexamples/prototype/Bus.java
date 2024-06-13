package brian.example.java.design.pattern.designpatternexamples.prototype;

public class Bus extends Vehicle{
    private int doors;

    public Bus(Bus bus){
        super(bus);
        this.doors = bus.doors;
    }

    public Bus(String brand, String model, String color, int doors){
        super(brand, model, color);
        this.doors = doors;
    }

    @Override
    public Bus clone(){
        return new Bus(this);
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public String toString(){
        return "Bus[brand="+this.brand+",model="+this.model+",color="+this.color+",doors="+this.doors+"]";
    }
}

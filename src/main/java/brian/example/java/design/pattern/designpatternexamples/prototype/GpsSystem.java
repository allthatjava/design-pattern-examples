package brian.example.java.design.pattern.designpatternexamples.prototype;

public class GpsSystem {
    private String startingCity;

    public GpsSystem(String startingCity){
        this.startingCity = startingCity;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public void setStartingCity(String startingCity){
        this.startingCity = startingCity;
    }

    public String toString(){
        return "GpsSystem[startingCity="+startingCity+"]";
    }

}

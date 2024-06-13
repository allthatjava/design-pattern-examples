package brian.example.java.design.pattern.designpatternexamples.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();
    private String name;

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Singleton[name="+name+"]";
    }
}

package brian.example.java.design.pattern.designpatternexamples.factory;

public abstract class Ship {

    private String name;
    private int size;

    public String getName(){ return name; }
    public void setName(String name){ this.name=name;}

    public int getSize(){ return size; }
    public void setSize(int size){ this.size=size;}

    public void movingForward(){
        System.out.println(name +" - Moving forward "+size+" meter ");
    }
}

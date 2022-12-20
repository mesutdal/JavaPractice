package Group13;

public class Vehicle {
public static String made="russian american all made in taiwan";
    private String name;
    private String model;
    private int year;
    private String engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Vehicle(String name, String model, int year, String engine) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    public void start(){
        System.out.println(name+ " is started");
    }

    public void stop(){
        System.out.println(name+" is stopped");
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    public boolean isRunning(){
        return true;
    }

    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", isRunning='" + isRunning() + '\'' +
                '}';
    }

    public String sayMyName(){
        return name;
    }

    public void setMyName(String isim){
        name=isim;
    }

}

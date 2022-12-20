package Group13.Car;

public class Mercedes extends Car {

    private String reliable;


    public Mercedes(int year, String engine, String reliable) {
        super("Mercedes", year, engine);
        this.reliable = reliable;
    }


    public void Break(){
        System.out.println(sayMyName()+getModel()+" is breaking");
    }

    @Override
    public String toString() {
        return super.toString()+" "+getModel()+" "+getYear();
    }

    public String getReliable() {
        return reliable;
    }

    public void setReliable(String reliable) {
        this.reliable = reliable;
    }


}

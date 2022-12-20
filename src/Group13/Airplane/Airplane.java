package Group13.Airplane;

import Group13.Vehicle;

public class Airplane extends Vehicle {

    public Airplane(String model, int year, String engine) {
        super("Airplane", model, year, engine);
    }

    public void move(){
        System.out.println( " is flying");
    }


    @Override
    public String toString() {
        return sayMyName()+" is flying";
    }
}

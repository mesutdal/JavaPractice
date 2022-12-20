package Group13.Ship;

import Group13.Vehicle;

public class Ship extends Vehicle {

    public Ship(String model, int year, String engine) {
        super("Ship", model, year, engine);
    }

    public void move(){
        System.out.println(sayMyName()+" is sailing");
    }

    @Override
    public String toString() {
        return super.toString()+" is fishing";
    }
}
